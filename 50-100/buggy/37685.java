private java.io.BufferedReader getBufferedReader() throws java.io.IOException, pl.funnyqrz.utils.exceptions.InvalidHostException {
    getLogger().error(("Show api url:" + (host)));
    if ((!(pl.funnyqrz.utils.resource.PropertiesValidator.isEmpty(host))) || (pl.funnyqrz.utils.resource.PropertiesValidator.isValidUrl(host)))
        throw new pl.funnyqrz.utils.exceptions.InvalidHostException("Invalid host!");
    
    java.net.URL urlAddress = new java.net.URL(host);
    java.net.HttpURLConnection httpsURLConnection = ((java.net.HttpURLConnection) (urlAddress.openConnection()));
    return new java.io.BufferedReader(new java.io.InputStreamReader(httpsURLConnection.getInputStream()));
}