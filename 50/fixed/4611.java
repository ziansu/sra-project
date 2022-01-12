public boolean isUserExist(sample.handleData.User checkUser) {
    if (((this.listOfUser()) == null) || (!(this.listOfUser().contains(checkUser)))) {
        return false;
    }else {
        return true;
    }
}