@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    try {
        ((org.jtrfp.trcl.game.TVF3Game) (tr.getGame())).abortCurrentMission();
        ((org.jtrfp.trcl.game.TVF3Game) (tr.getGame())).setLevelIndex(levelList.getSelectedIndex());
        ((org.jtrfp.trcl.game.TVF3Game) (tr.getGame())).doGameplay();
    } catch (org.jtrfp.trcl.game.Game.CanceledException e) {
        java.lang.System.out.println("Canceled.");
    }
    return null;
}