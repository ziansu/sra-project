@org.junit.Test
public void testShowErrorMessage() {
    when(mockDataManager.getTeams()).thenReturn(rx.Single.<java.util.List<com.kbaldauf.playerfinder.model.Team>>error(any(java.lang.Throwable.class)));
    presenter.attachView(mockTeamView);
    verify(mockDataManager).getTeams();
    verify(mockTeamView).showErrorMessage();
}