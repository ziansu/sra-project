public java.lang.String generateUrl(java.lang.String method) {
    java.lang.String url = method + "Json/";
    url += (devId) + "/";
    url += (generateSignature(method)) + "/";
    url += (HiRezAPI.sessions.getProperty(platform)) + "/";
    url += generateTimestamp();
    return url;
}