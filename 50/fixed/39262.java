@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    try {
        return com.cortocamino.yoh.multasdetransito.MainActivity.utils.downloadUrl(urls[0]);
    } catch (java.io.IOException e) {
        return null;
    }
}