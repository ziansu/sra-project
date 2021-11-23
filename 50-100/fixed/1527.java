@org.junit.Test
public void validateFeedResultsNotStartedTest() throws io.delimeat.core.feed.validation.FeedValidationException {
    io.delimeat.core.feed.validation.FeedResultValidator validator = org.mockito.Mockito.mock(io.delimeat.core.feed.validation.FeedResultValidator.class);
    service.setSeasonFeedResultValidators(java.util.Arrays.asList(validator));
    io.delimeat.core.feed.FeedProcessor processor = org.mockito.Mockito.mock(io.delimeat.core.feed.FeedProcessor.class);
    org.mockito.Mockito.when(processor.getStatus()).thenReturn(FeedProcessorStatus.ENDED_ABORT);
    io.delimeat.core.show.Show show = new io.delimeat.core.show.Show();
    show.setShowType(ShowType.SEASON);
    service.validateFeedResults(processor, new java.util.ArrayList<io.delimeat.core.feed.FeedResult>(), show);
    org.mockito.Mockito.verifyZeroInteractions(validator);
}