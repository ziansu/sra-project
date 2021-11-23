private boolean isPasswordValid(java.lang.String password) {
    java.lang.String regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,14}$";
    return password.matches(regexp);
    return (password.length()) > 1;
}