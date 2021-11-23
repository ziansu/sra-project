public static void create(com.once.api.VIFConfig config) throws java.io.UnsupportedEncodingException, java.net.MalformedURLException {
    java.util.Map<java.lang.String, java.lang.String> header = new java.util.HashMap<java.lang.String, java.lang.String>();
    header.put("Module", "VIF");
    header.put("Method", "create");
    java.net.URL url = new java.net.URL(com.once.api.VIF.urlString);
    java.lang.String response = com.once.api.Connection.sendPost(url, header, config.toMap());
    java.lang.System.out.println(response);
}