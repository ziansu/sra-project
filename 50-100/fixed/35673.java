@org.junit.Test
@java.lang.SuppressWarnings(value = "unchecked")
public void replayingAFailedJobNoParamShouldExecuteAgainSchedulerServiceWithNoParameters() throws java.lang.Exception {
    final long jobDescriptorId = 25L;
    doNothing().when(schedulerService).executeAgain(anyLong(), anyList());
    processAPI.replayFailedJob(jobDescriptorId, null);
    processAPI.replayFailedJob(jobDescriptorId, java.util.Collections.EMPTY_MAP);
    verify(schedulerService, times(2)).executeAgain(jobDescriptorId);
}