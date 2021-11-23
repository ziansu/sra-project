@java.lang.Override
public void getUser(java.lang.String name, int password, com.example.gevorg.easynote.utils.user.OnUserFound onUserFound) {
    for (com.example.gevorg.easynote.model.User user : mUsersList.getUsers()) {
        if ((user.getUserName().equalsIgnoreCase(name)) && ((user.getPassword()) == password)) {
            notifyUserFound(user, onUserFound);
            return ;
        }
    }
    notifyUserFound(null, onUserFound);
}