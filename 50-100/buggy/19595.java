@java.lang.Override
protected java.lang.Integer doInBackground(android.graphics.Bitmap... data) {
    for (int i = 0; i < (data.length); i++) {
        android.graphics.Bitmap bitmap = data[i];
        java.lang.String name = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        if (i == 1) {
            synchronized(syncSendMsg) {
                fileName = (((path) + "/") + name) + ".jpg";
            }
        }
        if (bitmap != null)
            save(name, bitmap);
        
    }
    return 1;
}