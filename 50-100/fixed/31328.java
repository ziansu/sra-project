public void saveProps() throws java.lang.Throwable {
    java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(settings)));
    bw.write(_Base64.ToBase64String(toString().getBytes()));
    bw.close();
}