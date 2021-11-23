@java.lang.Override
protected java.lang.String[] doInBackground(java.lang.String... params) {
    return me.xiaopan.sketch.util.SketchUtils.getAllAvailableSdcardPath(getContext());
}