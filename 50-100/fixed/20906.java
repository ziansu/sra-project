public void register() {
    userDOAResponse = userDAO.insert(user);
    if ((userDOAResponse) == 0) {
        dv512.model.Profile p = user.getProfile();
        p.setUserId(user.getId());
        boolean profileDOAResponse = profileDAO.insert(p);
        if (profileDOAResponse) {
            mode = SUCCESS_MODE;
        }
    }else {
        mode = FAILED_MODE;
    }
}