@java.lang.Override
public boolean validLogin(java.lang.String email, java.lang.String password) throws java.io.UnsupportedEncodingException {
    if (!(registerredUsers.containsKey(email))) {
        return false;
    }
    return registerredUsers.get(email).getPassword().equals(model.pojo.UsersManager.convertToMd5(password));
}