public static void trustConnection(java.net.URLConnection connection) {
    if (!(connection instanceof javax.net.ssl.HttpsURLConnection))
        return ;
    
    javax.net.ssl.HttpsURLConnection httpsConnection = ((javax.net.ssl.HttpsURLConnection) (connection));
    httpsConnection.setSSLSocketFactory(com.massivecraft.massivecore.util.WebUtil.TRUSTING_SOCKET_FACTORY);
}