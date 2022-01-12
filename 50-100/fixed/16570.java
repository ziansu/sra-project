private void output(java.net.HttpURLConnection httpURLConnection, java.lang.String data) throws java.io.IOException {
    java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "utf-8"));
    bufferedWriter.write(data);
    bufferedWriter.flush();
    bufferedWriter.close();
    outputStream.close();
}