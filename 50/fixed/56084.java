public void changeProxy() {
    indexForProxyList = ((indexForProxyList) + 1) % (proxyList.size());
    java.lang.String proxy = proxyList.get(indexForProxyList);
    java.lang.System.out.println(proxy);
    java.lang.System.setProperty("socksProxyHost", proxy);
}