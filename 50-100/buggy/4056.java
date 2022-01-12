private java.lang.Boolean hasAccess(org.xwiki.users.User user, org.xwiki.security.authorization.Right access, org.phenotips.data.Patient patient) {
    java.util.Collection<org.phenotips.projects.data.Project> projects = this.ptBinder.getProjectsForPatient(patient);
    for (org.phenotips.projects.data.Project project : projects) {
        java.util.Collection<org.phenotips.data.permissions.Collaborator> collaborators = project.getCollaborators();
        for (org.phenotips.data.permissions.Collaborator collaborator : collaborators) {
            return (collaborator.isUserIncluded(user)) && (this.leaderAccessLevel.equals(collaborator.getAccessLevel()));
        }
    }
    return null;
}