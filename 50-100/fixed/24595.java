public boolean hasWrongPasswordField(java.lang.String encodedPassword, org.springframework.validation.BindingResult result) {
    java.lang.String passwordFieldValue = ((java.lang.String) (result.getFieldValue("password")));
    if (passwordEncoder.matches(passwordFieldValue, encodedPassword))
        return false;
    
    java.lang.String wrongPasswordMessage = "Nieprawidłowe hasło";
    result.rejectValue("password", "CorrectPassword", wrongPasswordMessage);
    return true;
}