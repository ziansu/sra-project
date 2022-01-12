public java.lang.String register() {
    try {
        user = org.bfh.jass.user.UserAccessor.getCurrentInstance().createNewUser(name, password, dateOfBirth);
        if ((user) == null) {
            greeting = "Impossible to register";
            java.lang.System.out.println(greeting);
            return "register?faces-redirect=true";
        }
        greeting = "Register OK, proceed to login";
        java.lang.System.out.println(greeting);
        user = null;
        return "login?faces-redirect=true";
    } catch (java.lang.RuntimeException e) {
        greeting = "Impossible to register";
        java.lang.System.out.println(("Exception :" + (greeting)));
        return "register?faces-redirect=true";
    }
}