public boolean validatePassword(java.lang.String password) {
    if (password == null) {
        this.errors.add("Password is required.");
        return false;
    }
    if (!(password.isEmpty())) {
        if (!(password.matches(com.epam.danilchican.betting.validator.UserValidator.PASSWORD_REGEX))) {
            this.errors.add("Your password must be at least 6 characters as well as contain at least one uppercase, one lowercase, and one number.");
            return false;
        }
    }
    return true;
}