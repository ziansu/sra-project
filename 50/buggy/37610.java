@java.lang.Override
protected void onProgressUpdate(org.empyrn.darkknight.engine.ThinkingInfo... values) {
    final org.empyrn.darkknight.GUIInterface guiInterface = getGui();
    if (guiInterface != null) {
        guiInterface.onThinkingInfoChanged(values[0]);
    }
}