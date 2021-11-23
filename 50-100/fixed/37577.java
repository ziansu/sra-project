public void addIssue() throws java.io.IOException {
    java.lang.System.out.println("addIssue");
    javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    context.addMessage(null, new javax.faces.application.FacesMessage(enquirySessionBeanLocal.addNewCaseIssue(caseId, departmentTo, issueProblem), " "));
    departmentTo = null;
    issueProblem = null;
}