public java.lang.String emailChecker(java.lang.String email) {
    java.lang.String emailCheck = "";
    emailMatcher = emailPattern.matcher(email);
    if ((emailMatcher.matches()) == true) {
        emailCheck = "Status Code 200: Clear";
    }else {
        emailCheck = "Status Code 400: Invalid Entry";
    }
    return emailCheck;
}