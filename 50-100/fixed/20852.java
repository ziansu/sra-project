@org.junit.Test
public void testShowErrorMessage() {
    when(mockDataManager.getTeams()).thenReturn(rx.Single.<java.util.List<com.kbaldauf.playerfinder.model.Team>>error(new java.lang.Throwable()));
    presenter.attachView(mockTeamView);
    verify(mockDataManager).getTeams();
    verify(mockTeamView).showErrorMessage();
}