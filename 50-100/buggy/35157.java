@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        if ((status) == "isExist") {
            doc_userinfo = org.jsoup.Jsoup.connect(url).get();
        }else
            if ((status) == "crawl") {
                doc_status = org.jsoup.Jsoup.connect(url).get();
            }else {
            }
        
    } catch (java.net.MalformedURLException | java.net.ProtocolException exception) {
        exception.printStackTrace();
    } catch (java.io.IOException io) {
        io.printStackTrace();
    }
    return null;
}