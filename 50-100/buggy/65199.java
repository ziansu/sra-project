@java.lang.Override
public boolean authenticate(java.lang.Object dbContext, java.lang.String username, java.lang.String password) {
    java.util.List<com.ustadmobile.nanolrs.core.model.User> users = findByUsername(dbContext, username);
    if ((users == null) || ((users.size()) == 0)) {
        return false;
    }
    com.ustadmobile.nanolrs.core.model.User user = users.get(0);
    if ((user.getPassword()) == password) {
        return true;
    }else {
        return false;
    }
}