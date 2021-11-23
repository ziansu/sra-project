private void doZap() {
    if (com.js.geometryapp.editor.Editor.ZAP_SUPPORTED) {
        disposeOfStateSnapshot();
        mState = new com.js.geometryapp.editor.EditorState(null, null, calcDefaultDupAccumulator());
        mCommandHistory.clear();
        mCommandHistoryCursor = 0;
    }
}