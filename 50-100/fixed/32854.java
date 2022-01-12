@java.lang.Override
protected java.lang.String doInBackground(java.lang.Void... params) {
    try {
        java.io.FileOutputStream fos = context.openFileOutput(name, Context.MODE_PRIVATE);
        fos.write(data);
        fos.close();
    } catch (java.io.IOException exc) {
        throw new java.lang.IllegalStateException(exc);
    }
    return name;
}