public void register() {
    boolean userDOAResponse = userDAO.insert(user);
    dv512.model.Profile p = user.getProfile();
    p.setUserId(user.getId());
    boolean profileDOAResponse = profileDAO.insert(p);
    if ((userDOAResponse == true) && (profileDOAResponse == true)) {
        mode = SUCCESS_MODE;
    }else {
        mode = FAILED_MODE;
    }
}