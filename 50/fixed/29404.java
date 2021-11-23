public boolean userExist(java.lang.String email) {
    if (((com.app.model.Demographics) (userList.get(email.toLowerCase()))) != null)
        return true;
    
    return false;
}