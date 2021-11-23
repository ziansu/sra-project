public boolean validateSelectedDataverse() {
    if ((selectedDestinationDataverse) == null) {
        javax.faces.context.FacesContext.getCurrentInstance().addMessage(getSelectedDataverseMenu().getClientId(), new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, "", edu.harvard.iq.dataverse.util.JsfHelper.JH.localize("harvestclients.newClientDialog.dataverse.required")));
        return false;
    }
    return true;
}