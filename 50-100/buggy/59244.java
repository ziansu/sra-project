@java.lang.Override
protected java.lang.Object doInBackground(java.lang.Object[] params) {
    java.io.InputStream in = null;
    try {
        java.net.URL url = new java.net.URL(com.jacks205.spots.constants.Constants.URL);
        in = url.openStream();
        com.jacks205.spots.Spots.RetrieveJsonTask.JsonResponse response = parseJson(in);
        return response;
    } catch (java.lang.Exception e) {
        return e;
    }
}