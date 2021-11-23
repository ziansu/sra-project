public java.lang.String validate() {
    java.lang.System.out.println("hit VALIDATE");
    if ((models.Level.authenticate(id, password)) == null) {
        java.lang.System.out.println("invalid form");
        return "Invalid user or password";
    }else {
        java.lang.System.out.println("validation passed");
        return null;
    }
}