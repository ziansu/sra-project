@java.lang.Override
public void userChanged(java.lang.String username, java.lang.Object context) {
    com.ustadmobile.nanolrs.core.manager.UserManager userManager = com.ustadmobile.nanolrs.core.persistence.PersistenceManager.getInstance().getManager(com.ustadmobile.nanolrs.core.manager.UserManager.class);
    com.ustadmobile.nanolrs.core.model.User loggedInUser = null;
    loggedInUser = userManager.findByUsername(context, username);
    if (loggedInUser == null) {
        java.lang.System.out.println("No user logged in. Setting null (will not proceed)");
    }
    umSyncService.setLoggedInUser(loggedInUser);
}