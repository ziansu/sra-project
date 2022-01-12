public void modifySite() {
    addableSite.setId(selectedSite.getId());
    addableSite.setShelfs(selectedSite.getShelfs());
    addableSite.setWorkers(selectedSite.getWorkers());
    ss.editSite(addableSite);
    addableSite = new entities.Site();
    javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    context.addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Site updated!", "OK"));
}