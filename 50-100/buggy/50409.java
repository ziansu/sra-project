@org.junit.Test
public void should_perform_search() throws java.lang.Exception {
    org.mockito.Mockito.when(mScheduleRestApi.searchJob(anyMapOf(java.lang.String.class, java.lang.Object.class))).thenReturn(java.util.Collections.<com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity>emptyList());
    useCase.searchJob(com.jaspersoft.android.sdk.service.report.schedule.ReportScheduleUseCaseTest.CRITERIA);
    org.mockito.Mockito.verify(mSearchCriteriaMapper).transform(com.jaspersoft.android.sdk.service.report.schedule.ReportScheduleUseCaseTest.CRITERIA);
    org.mockito.Mockito.verify(mScheduleRestApi).searchJob(com.jaspersoft.android.sdk.service.report.schedule.ReportScheduleUseCaseTest.SEARCH_PARAMS);
    org.mockito.Mockito.verify(mJobUnitMapper).transform(java.util.Collections.<com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity>emptyList(), com.jaspersoft.android.sdk.service.report.schedule.ReportScheduleUseCaseTest.SIMPLE_DATE_FORMAT);
}