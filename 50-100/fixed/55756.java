public boolean isValidName(java.lang.String userName) {
    boolean isUniqueUser = true;
    if ((userName.trim().length()) == 0) {
        isUniqueUser = false;
    }else {
        for (codeu.chat.common.User currentUser : getUsers()) {
            if (currentUser.name.toUpperCase().equals(userName.toUpperCase())) {
                java.lang.System.out.format("Error: user not created - %s already exists.", userName);
                isUniqueUser = false;
            }
        }
    }
    return isUniqueUser;
}