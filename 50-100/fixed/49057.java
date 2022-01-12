@java.lang.Override
public boolean confirmCredentials(java.lang.String username, java.lang.String password) {
    if ((userStore) == null) {
        return false;
    }
    com.wedriveu.services.authentication.entity.User user;
    userStore.mapEntityToJson();
    user = userStore.getUser(username);
    return ((user != null) && (user.getUsername().equals(username))) && (user.getPassword().equals(password));
}