private void output(java.net.HttpURLConnection httpURLConnection, java.lang.String... args) throws java.io.IOException {
    java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "utf-8"));
    java.lang.String data = ((java.net.URLEncoder.encode("email", "UTF-8")) + "=") + (java.net.URLEncoder.encode(args[0], "utf-8"));
    bufferedWriter.write(data);
    bufferedWriter.flush();
    bufferedWriter.close();
    outputStream.close();
}