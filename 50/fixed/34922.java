public boolean userWasLoggedIn() {
    if ((edu.chl.leep.model.LeepModel.getKeepLoginState()) == 0) {
        edu.chl.leep.model.LeepModel.setUSER(edu.chl.leep.model.LeepModel.getPreviousUser());
        return true;
    }
    return false;
}