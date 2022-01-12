public ch.entwine.weblounge.common.site.Site findSiteByBundle(org.osgi.framework.Bundle bundle) {
    for (java.util.Map.Entry<ch.entwine.weblounge.common.site.Site, org.osgi.framework.Bundle> entry : siteBundles.entrySet()) {
        if (bundle.equals(entry.getValue()))
            return entry.getKey();
        
    }
    return null;
}