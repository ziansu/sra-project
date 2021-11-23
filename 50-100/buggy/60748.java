private void getFileList(java.lang.String[] inp) throws java.io.IOException {
    java.lang.System.out.println("Asking Tracker for file list");
    n.out.println("get file list");
    java.lang.String response = n.in.readLine();
    java.lang.String[] parsedResponse = response.split("#'");
    java.lang.System.out.println("Available files to retrieve:");
    for (java.lang.String x : parsedResponse) {
        java.lang.System.out.println(x);
    }
}