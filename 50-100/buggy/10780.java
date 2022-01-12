@org.springframework.transaction.annotation.Transactional
public de.tum.in.www1.exerciseapp.domain.Result retreiveBuildDetailsFromBambooAndStoreThem(de.tum.in.www1.exerciseapp.domain.Result result) {
    de.tum.in.www1.exerciseapp.domain.Participation participation = result.getParticipation();
    java.util.Map buildDetails = continuousIntegrationService.get().getLatestBuildResultDetails(participation);
    java.util.HashSet<de.tum.in.www1.exerciseapp.domain.Feedback> feedbacks = continuousIntegrationService.get().createFeedbacksForResult(buildDetails);
    result.setFeedbacks(feedbacks);
    resultRepository.save(result);
    return result;
}