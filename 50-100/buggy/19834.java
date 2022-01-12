public static void postToPage(java.lang.String url, java.lang.String postBody) {
    try {
        java.net.HttpURLConnection con = ((java.net.HttpURLConnection) (new java.net.URL(url).openConnection()));
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setRequestProperty("Content-Type", "multipart/form-data");
        java.io.DataOutputStream wr = new java.io.DataOutputStream(con.getOutputStream());
        wr.writeBytes(postBody);
        java.lang.System.out.println(con.getHeaderFields());
    } catch (java.lang.Exception e) {
    }
}