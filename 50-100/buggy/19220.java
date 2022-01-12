@java.lang.Override
public boolean loginUser(java.lang.String username, java.lang.String password) throws client.networking.ServerProxyException {
    java.lang.String postData = serializer.sCredentials(username, password);
    java.lang.String urlPath = "/user/login";
    try {
        java.lang.String response = doJSONPost(urlPath, postData, true, false);
    } catch (client.networking.ServerProxyException e) {
        if (e.getMessage().toLowerCase().contains("failed to login")) {
            return false;
        }else
            throw e;
        
    }
    return true;
}