@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Exception {
    org.infinity.resource.Profile.openGame(keyFile, org.infinity.gui.BrowserMenuBar.getInstance().getBookmarkName(keyFile), forcedGame);
    org.infinity.NearInfinity.advanceProgress("Initializing GUI...");
    org.infinity.gui.BrowserMenuBar.getInstance().gameLoaded(Profile.Game.Unknown, null);
    org.infinity.util.CreMapCache.reset();
    return null;
}