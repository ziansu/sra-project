private static java.util.List<java.lang.String> extractVirtualHostList(final org.osgi.framework.Bundle bundle) {
    java.util.List<java.lang.String> virtualHostList = new java.util.LinkedList<>();
    java.lang.String virtualHostListAsString = org.ops4j.pax.web.extender.war.internal.util.ManifestUtil.getHeader(bundle, "Web-VirtualHosts");
    if ((virtualHostListAsString != null) && ((virtualHostListAsString.length()) > 0)) {
        java.lang.String[] virtualHostArray = virtualHostListAsString.split(",");
        for (java.lang.String virtualHost : virtualHostArray) {
            virtualHostList.add(virtualHost.trim());
        }
    }
    return virtualHostList;
}