public static java.lang.String getPageUrlForTool(javax.servlet.http.HttpServletRequest req, org.sakaiproject.site.api.Site site, org.sakaiproject.site.api.ToolConfiguration pageTool) {
    if (req == null)
        req = org.sakaiproject.portal.util.ToolUtils.getRequestFromThreadLocal();
    
    if (site == null)
        return null;
    
    org.sakaiproject.site.api.SitePage thePage = pageTool.getContainingPage();
    if (thePage == null)
        return null;
    
    return org.sakaiproject.portal.util.ToolUtils.getPageUrl(req, site, thePage);
}