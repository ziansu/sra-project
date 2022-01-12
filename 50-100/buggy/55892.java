@org.springframework.cloud.stream.annotation.StreamListener(target = SlideGeneratorRequestSink.CHANNEL_NAME)
public void process(pl.edu.agh.toik.service.domain.IssuesSlideGenerationRequest request) throws java.io.IOException {
    pl.edu.agh.toik.service.SlideGeneratorRequestHandler.LOGGER.info(("Processing IssuesSlideGenerationRequest: " + request));
    pl.edu.agh.toik.sonarapi.entity.IssuesResponse issues = statisticsHandler.getGeneralIssuesStatistics(request);
    java.lang.String issuesByType = slideGenerator.getIssuesByType(issues);
    pl.edu.agh.toik.service.SlideGeneratorRequestHandler.LOGGER.info(issuesByType);
    replyChannel.send(org.springframework.messaging.support.MessageBuilder.withPayload(new pl.edu.agh.toik.service.domain.GeneratedSlideResponse(issuesByType)).build());
}