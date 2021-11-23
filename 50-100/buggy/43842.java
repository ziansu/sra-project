public net.lightbody.bmp.core.har.Har newHar(java.lang.String initialPageRef) {
    pageCount.set(1);
    net.lightbody.bmp.core.har.Har oldHar = getHar();
    net.lightbody.bmp.core.har.Har har = new net.lightbody.bmp.core.har.Har(new net.lightbody.bmp.core.har.HarLog(net.lightbody.bmp.proxy.ProxyServer.CREATOR));
    client.setHar(har);
    newPage(initialPageRef);
    return oldHar;
}