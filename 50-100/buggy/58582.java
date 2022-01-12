public static org.openmrs.module.appframework.domain.AppDescriptor findPatientTemplateApp(java.lang.String id, java.lang.String label, java.lang.String icon, java.lang.String privilege, java.lang.String afterSelectedUrl, org.codehaus.jackson.node.ArrayNode breadcrumbs) {
    org.openmrs.module.appframework.domain.AppDescriptor app = new org.openmrs.module.appframework.domain.AppDescriptor(id, id, label, ("coreapps/findpatient/findPatient.page?app=" + id), icon, null, 0, privilege, null);
    app.setInstanceOf("coreapps.template.findPatient");
    app.setConfig(org.openmrs.module.mirebalais.apploader.CustomAppLoaderUtil.objectNode("afterSelectedUrl", afterSelectedUrl, "label", label, "heading", label, "showLastViewedPatients", false, "breadcrumbs", breadcrumbs));
    return app;
}