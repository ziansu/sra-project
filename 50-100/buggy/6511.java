public boolean usernameExist(java.lang.String username) {
    java.util.List<sample.handleData.User> list = this.listOfUser();
    for (sample.handleData.User u : list) {
        if (u.username().equals(username)) {
            return true;
        }
    }
    return false;
}