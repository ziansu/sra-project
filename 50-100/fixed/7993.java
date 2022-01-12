public void setUserName(java.lang.String userName) {
    if (userName == null)
        throw new java.lang.IllegalArgumentException("UserName must not be null.");
    
    if ((userName.length()) > 50)
        throw new java.lang.IllegalArgumentException("UserName is too long.");
    
    if ((userName.length()) < 3)
        throw new java.lang.IllegalArgumentException("UserName is too short.");
    
    this.userName = userName;
}