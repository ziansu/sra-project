public java.lang.String getPublicIp() {
    try {
        java.net.URL getIp = new java.net.URL(ipUrl);
        java.net.URLConnection connection = getIp.openConnection();
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()));
        java.lang.String ip = in.readLine();
        in.close();
        return ip;
    } catch (java.io.IOException e) {
    }
    return null;
}