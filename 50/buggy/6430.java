protected boolean isPathFragment(org.eclipse.emf.common.util.URI proxyURI) {
    java.lang.String uriFragment = proxyURI.fragment();
    return (uriFragment.charAt(0)) == '/';
}