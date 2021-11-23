public void prepare() {
    id = org.apache.commons.lang3.StringUtils.trimToNull(req.getParameter("id"));
    setHostingOrganisation(registrationManager.getHostingOrganisation());
}