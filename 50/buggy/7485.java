private boolean CheckIsUsernameUnique(java.lang.String uName) {
    if ((FindPlayerByName(uName)) != null)
        return true;
    else
        return false;
    
}