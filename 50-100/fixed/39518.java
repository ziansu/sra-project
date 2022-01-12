public java.lang.String delete() {
    java.lang.String[] selectedFiles = org.genepattern.server.webapp.jsf.UIBeanHelper.getRequest().getParameterValues("selectedFiles");
    if (selectedFiles != null) {
        for (java.lang.String jobFileName : selectedFiles) {
            deleteFile(jobFileName);
        }
    }
    java.lang.String[] selectedJobs = org.genepattern.server.webapp.jsf.UIBeanHelper.getRequest().getParameterValues("selectedJobs");
    deleteJobs(selectedJobs);
    this.resetJobs();
    return null;
}