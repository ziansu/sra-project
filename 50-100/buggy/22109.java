@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mProjectManager.getEditorState()) == (DanceBotEditorManager.State.NEW)) {
        android.util.Log.v(ch.ethz.asl.dancebots.danceboteditor.activities.EditorActivity.LOG_TAG, "resumed EditorActivity with a song loaded");
        ch.ethz.asl.dancebots.danceboteditor.handlers.SoundManager.startDecoding(this, mProjectManager.getDanceBotMusicFile(), null, 4);
        mProjectManager.setEditorState(DanceBotEditorManager.State.EDITING);
    }
}