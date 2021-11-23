public void setUserName(java.lang.String userName) {
    try {
        if (userName == null) {
            throw new java.lang.IllegalArgumentException("This field is required");
        }else
            if (!(userName.matches(regex.USER_NAME_VALIDATION_REGEXP))) {
                throw new java.lang.IllegalArgumentException("Invalid name, please try again!");
            }
        
        this.userName = userName;
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
        exceptions.add(e);
    }
}