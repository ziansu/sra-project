@fi.muikku.security.Permit(value = ForumResourcePermissionCollection.FORUM_CREATEENVIRONMENTFORUM)
public fi.muikku.plugins.forum.model.EnvironmentForumArea createEnvironmentForumArea(java.lang.String name, java.lang.Long groupId) {
    fi.muikku.model.users.UserEntity owner = sessionController.getLoggedUserEntity();
    fi.muikku.model.security.ResourceRights rights = resourceRightsController.create();
    fi.muikku.plugins.forum.model.ForumAreaGroup group = (groupId != null) ? findForumAreaGroup(groupId) : null;
    return environmentForumAreaDAO.create(name, group, false, owner, rights);
}