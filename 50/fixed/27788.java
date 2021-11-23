@java.lang.Override
public boolean registerNewUser(java.lang.String login, java.lang.String password) {
    if ((login == null) || (password == null))
        return false;
    
    return !(login.equals("admin"));
}