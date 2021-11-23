@org.junit.Test
public void testNotExistingGame() throws ligamanager.spion.analyzer.pages.LmIllegalPageException {
    int expectedGameId = 1000000;
    ligamanager.spion.analyzer.pages.LmGamePage subject = new ligamanager.spion.analyzer.pages.LmGamePage(expectedGameId, 124);
    try {
        subject.navigateToPageAndCheck();
    } catch (ligamanager.spion.analyzer.pages.LmIllegalGameException ex) {
        assertEquals(expectedGameId, ex.getGameId());
        assertEquals(124, ex.getSeasonNumber());
        assertEquals(IllegalGameType.NoGame, ex.getGameType());
    }
}