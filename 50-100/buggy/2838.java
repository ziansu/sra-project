boolean isNativeScrollbar() {
    javax.servlet.ServletRequest request = ((javax.servlet.ServletRequest) (org.zkoss.zk.ui.Executions.getCurrent().getNativeRequest()));
    if (org.zkoss.web.servlet.Servlets.isBrowser(request, "ie8-")) {
        return true;
    }else {
        boolean isMobile = ((org.zkoss.web.servlet.Servlets.getBrowser(request, "mobile")) != null) && (org.zkoss.zk.ui.WebApps.getFeature("ee"));
        return org.zkoss.zul.impl.Utils.testAttribute(this, "org.zkoss.zul.nativebar", (!isMobile), true);
    }
}