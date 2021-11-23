public boolean makeNewUser(java.lang.String id, java.lang.String password, java.lang.String name, boolean isManager) {
    main.logic.Clerk user = null;
    if ((findUser(id)) != null) {
        return false;
    }else
        if (isManager) {
            user = new main.logic.Manager(name, id, password);
        }else {
            user = new main.logic.Clerk(name, id, password);
        }
    
    allUsers.add(user);
    main.fileio.UserIO.saveUsers(allUsers);
    return user != null;
}