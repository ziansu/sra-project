protected void onBootstrap(org.springframework.context.ApplicationEvent applicationEvent) {
    org.alfresco.repo.security.authentication.AuthenticationUtil.setAdminUserAsFullyAuthenticatedUser();
    try {
        java.util.List<org.alfresco.service.cmr.site.SiteInfo> siteInfos = siteService.findSites("", 0);
        for (org.alfresco.service.cmr.site.SiteInfo s : siteInfos)
            propertyValuesBean.loadPropertyValues(s.getShortName());
        
    } catch (org.json.JSONException | org.alfresco.service.cmr.model.FileNotFoundException | java.io.IOException e) {
        e.printStackTrace();
    }
}