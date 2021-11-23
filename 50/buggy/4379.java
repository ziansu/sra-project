private void sendRequest(java.io.OutputStream os, java.lang.String request) {
    if (requestChanged) {
        try {
            writeRequest(os, request);
            requestChanged = false;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}