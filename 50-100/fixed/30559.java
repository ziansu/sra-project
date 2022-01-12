public static org.apache.http.client.HttpClient createHttpClient() {
    org.apache.http.client.HttpClient httpClient;
    org.apache.http.conn.scheme.SchemeRegistry schemeReg = new org.apache.http.conn.scheme.SchemeRegistry();
    schemeReg.register(new org.apache.http.conn.scheme.Scheme("http", org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory(), 80));
    org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager connMgr = new org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager(new org.apache.http.params.BasicHttpParams(), schemeReg);
    httpClient = new org.apache.http.impl.client.DefaultHttpClient(connMgr, new org.apache.http.params.BasicHttpParams());
    return httpClient;
}