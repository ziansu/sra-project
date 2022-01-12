public byte[] ShelfDownload(Diadoc.Api.string authToken, Diadoc.Api.string nameOnShelf) {
    if (!(nameOnShelf.Contains("__userId__")))
        nameOnShelf = string.Format("__userId__/{0}", nameOnShelf);
    
    java.util.List<Diadoc.Api.NameValuePair> params = new java.util.ArrayList<Diadoc.Api.NameValuePair>();
    params.add(new org.apache.http.message.BasicNameValuePair("nameOnShelf", nameOnShelf));
    return PerformGetHttpRequest("/ShelfDownload", params);
}