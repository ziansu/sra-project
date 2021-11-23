public boolean validateEmail(java.lang.String email) {
    if (email == null) {
        this.errors.add("Email is required.");
        return false;
    }
    if (!(email.isEmpty())) {
        this.oldInput.put(((com.epam.danilchican.betting.tag.OldInputFormAttributeTag.PREFIX) + "email"), email);
        if (!(email.matches(com.epam.danilchican.betting.validator.UserValidator.EMAIL_REGEX))) {
            this.errors.add("Email is invalid.");
            return false;
        }
    }
    return true;
}