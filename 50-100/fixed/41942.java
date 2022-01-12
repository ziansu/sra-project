@java.lang.Override
protected void setResourceValue(org.opencms.file.CmsResource resource) {
    org.opencms.site.CmsSite site = org.opencms.main.OpenCms.getSiteManager().getSiteForRootPath(resource.getRootPath());
    if ((!(m_useRootPaths)) && (org.opencms.ui.A_CmsUI.getCmsObject().getRequestContext().getSiteRoot().equals(site.getSiteRoot()))) {
        setValue(true, org.opencms.ui.A_CmsUI.getCmsObject().getSitePath(resource));
    }else {
        setValue(true, resource.getRootPath());
    }
}