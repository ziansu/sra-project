@java.lang.Override
public org.phenotips.data.permissions.AccessLevel getCurrentUserAccessLevel() {
    org.phenotips.data.permissions.AccessLevel highestAccessLevel = null;
    org.xwiki.users.User currentUser = this.getUserManager().getCurrentUser();
    java.util.Collection<org.phenotips.data.permissions.Collaborator> collaborators = this.getCollaborators();
    for (org.phenotips.data.permissions.Collaborator c : collaborators) {
        if (c.isUserIncluded(currentUser)) {
            org.phenotips.data.permissions.AccessLevel accessLevel = c.getAccessLevel();
            if ((accessLevel.compareTo(highestAccessLevel)) >= 0) {
                highestAccessLevel = accessLevel;
            }
        }
    }
    return highestAccessLevel;
}