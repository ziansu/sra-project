public void setProjectsForPatient(java.lang.String projectsSelected, org.phenotips.data.Patient patient) {
    java.util.List<java.lang.String> projectsList = new java.util.ArrayList<java.lang.String>();
    if (!(org.apache.commons.lang3.StringUtils.isEmpty(projectsSelected))) {
        for (java.lang.String projectId : projectsSelected.split(",")) {
            org.phenotips.projects.data.Project p = new org.phenotips.projects.internal.DefaultProject(projectId);
            projectsList.add(p.getFullName());
        }
    }
    java.lang.String projects = org.apache.commons.lang3.StringUtils.join(projectsList, org.phenotips.projects.internal.ProjectAndTemplateBinder.PROJECTS_SEPARATOR);
    setPropertyForPatient(patient, this.projectBindingReference, org.phenotips.projects.internal.ProjectAndTemplateBinder.PROJECT_BINDING_FIELD, projects);
}