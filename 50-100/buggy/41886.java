@org.junit.Test
public void testLoadRosterFailure() {
    org.mockito.Mockito.when(mockDataManager.getPlayers(org.mockito.ArgumentMatchers.anyString())).thenReturn(rx.Single.<java.util.List<com.kbaldauf.playerfinder.model.Player>>error(org.mockito.ArgumentMatchers.any(java.lang.Throwable.class)));
    presenter.attachView(mockRosterView);
    presenter.loadRoster(org.mockito.ArgumentMatchers.anyString());
    org.mockito.Mockito.verify(mockDataManager).getPlayers(org.mockito.ArgumentMatchers.anyString());
    org.mockito.Mockito.verify(mockRosterView).showErrorMessage();
}