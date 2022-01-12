@android.support.annotation.NonNull
private static java.lang.String getShellOutput(java.io.InputStream stdout) throws java.io.IOException {
    byte[] buffer = new byte[com.ghostflying.locationreportenabler.PropUtil.BUF_LEN];
    int read;
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    while (true) {
        read = stdout.read(buffer);
        out.append(new java.lang.String(buffer, 0, read));
        if (read < (com.ghostflying.locationreportenabler.PropUtil.BUF_LEN)) {
            break;
        }
    } 
    return out.toString();
}