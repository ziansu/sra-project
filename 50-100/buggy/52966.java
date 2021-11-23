@java.lang.Override
public void stop() {
    java.lang.String stringOfFile = gui.App.prefs.get("file", "def");
    int numOfBookmarks = gui.App.prefs.getInt(("bookmarkNum" + stringOfFile), (-1));
    gui.App.prefs.putInt(("bookmarkNum" + stringOfFile), numOfBookmarks);
    gui.MenuController controller = gui.App.loader.getController();
    controller.getSequenceHashMap().close();
}