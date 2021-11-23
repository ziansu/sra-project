private void finish() {
    com.squareup.okhttp.internal.Util.closeQuietly(downloadInput);
    com.squareup.okhttp.internal.Util.closeQuietly(downloadOutput);
    if ((call) != null) {
        call.cancel();
    }
    if ((body) != null) {
        com.squareup.okhttp.internal.Util.closeQuietly(body);
    }
}