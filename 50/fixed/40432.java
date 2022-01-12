public java.lang.String signUp() {
    user.setDateInscription(new java.util.Date());
    service.add(user);
    return "profile";
}