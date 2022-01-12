public void init() throws me.legrange.mikrotik.MikrotikApiException {
    connect();
    fetchIdentity();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> interfaceDetails = detectInterfaces();
    java.lang.System.out.println(interfaceDetails);
    for (java.util.Map<java.lang.String, java.lang.String> singleInterface : interfaceDetails) {
        RouterInterface r = createInterface(singleInterface);
        r.setInitialCost();
        r.listen(conn);
    }
}