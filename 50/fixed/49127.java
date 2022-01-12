public void setEmail(java.lang.String email) {
    if (com.ft.model.util.Validator.isValidEmailAddress(email)) {
        this.email = email.trim();
    }
}