private void intoObject(final java.lang.Object objectInto) {
    if (objectInto != null) {
        mInto = objectInto;
        final java.lang.String path = mPath;
        final java.lang.Object into = mInto;
        final com.github.florent37.davinci.transformation.Transformation transformation = mTransformation;
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
            @java.lang.Override
            protected java.lang.Void doInBackground(java.lang.Void... params) {
                loadImage(path, into, transformation);
                return null;
            }
        }.execute();
        this.resetParameters();
    }
}