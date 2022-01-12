public boolean checkIfLocked() {
    if ((document.field("locked_until")) != null) {
        java.util.Date now = new java.util.Date();
        if (now.before(((java.util.Date) (document.field("locked_until"))))) {
            java.lang.System.out.println("Account is still locked");
            return true;
        }else {
            document.field("login_attempts", 0);
            java.lang.System.out.println("Account is not locked");
            return false;
        }
    }else {
        return false;
    }
}