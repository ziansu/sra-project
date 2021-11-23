public byte[] ShelfDownload(java.lang.String authToken, java.lang.String nameOnShelf) {
    if (!(nameOnShelf.Contains("__userId__")))
        nameOnShelf = string.Format("__userId__/{0}", nameOnShelf);
    
    java.util.List<Diadoc.Api.NameValuePair> params = new java.util.ArrayList<Diadoc.Api.NameValuePair>();
    params.add(new org.apache.http.message.BasicNameValuePair("nameOnShelf", nameOnShelf));
    return PerformGetHttpRequest("/ShelfDownload", params);
}