public void saveIssue() throws java.io.IOException {
    javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    javax.faces.context.ExternalContext ec = context.getExternalContext();
    context.addMessage(null, new javax.faces.application.FacesMessage(enquirySessionBeanLocal.addNewCaseIssue(caseId, departmentTo, issueProblem, followUps), " "));
    caseId = null;
    departmentTo = null;
    issueProblem = null;
    followUps = null;
    ec.redirect(((ec.getRequestContextPath()) + "/web/internalSystem/enquiry/enquirymanagerSubmitDone.xhtml?faces-redirect=true"));
}