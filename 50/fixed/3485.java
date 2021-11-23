public static javax.net.ssl.HttpsURLConnection getHttpsURLConnection(java.lang.String urlString) throws java.io.IOException {
    java.net.URL url = new java.net.URL(urlString.replaceFirst("^[Hh][Tt][Tt][Pp]:", "https:"));
    return info.guardianproject.netcipher.NetCipher.getHttpsURLConnection(url, false);
}