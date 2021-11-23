@java.lang.Override
public void resetAdmin(java.lang.String loggedInUserName, java.lang.String username) throws java.lang.Exception {
    edu.stanford.epad.epadws.models.User loggedInUser = getUser(loggedInUserName);
    edu.stanford.epad.epadws.models.User user = getUser(username);
    if (((loggedInUser != null) && (!(loggedInUser.isAdmin()))) && (!(loggedInUserName.equals(user.getCreator()))))
        throw new java.lang.Exception("No permission to modify user");
    
    user.setAdmin(false);
    user.save();
    edu.stanford.epad.epadws.service.DefaultEpadProjectOperations.userCache.put(user.getUsername(), user);
}