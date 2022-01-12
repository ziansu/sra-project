public void onTrafficRedirect(java.lang.String traffic, boolean on) {
    switch (traffic) {
        case "HTTP" :
            mRouteMan.redirectHTTP(on, mRootMan);
            break;
        case "HTTPS" :
            mRouteMan.redirectHTTPS(on, mRootMan);
            break;
        case "DNS" :
            mRouteMan.redirectDNS(on, mRootMan);
            break;
    }
}