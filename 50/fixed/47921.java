@java.lang.Override
protected java.lang.String[] doInBackground(java.lang.String... params) {
    android.content.Context context = getContext();
    if (context == null) {
        return null;
    }
    return me.xiaopan.sketch.util.SketchUtils.getAllAvailableSdcardPath(context);
}