@java.lang.Override
public void userChanged(java.lang.String username, java.lang.Object context) {
    com.ustadmobile.nanolrs.core.manager.UserManager userManager = com.ustadmobile.nanolrs.core.persistence.PersistenceManager.getInstance().getManager(com.ustadmobile.nanolrs.core.manager.UserManager.class);
    com.ustadmobile.nanolrs.core.model.User loggedInUser = null;
    java.util.List<com.ustadmobile.nanolrs.core.model.User> users = userManager.findByUsername(context, username);
    if ((users != null) && (!(users.isEmpty()))) {
        loggedInUser = users.get(0);
    }else {
        loggedInUser = null;
        java.lang.System.out.println("No user logged in. Setting null (will not proceed)");
    }
    umSyncService.setLoggedInUser(loggedInUser);
}