public java.lang.String actionSignup(java.lang.String role) {
    boh.jee.ejb.model.Guest user = null;
    user = new boh.jee.ejb.model.User();
    user.setGuestName(userName);
    user.setGuestPhone(userPhone);
    user.setGuestEmail(userEmail);
    if (userSrv.userSignUp(user)) {
        return "roomlist";
    }else {
        illegalAccess = true;
        return "signup";
    }
}