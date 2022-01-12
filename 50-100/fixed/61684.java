public boolean checkCondForResendMail(java.util.HashMap<java.lang.String, java.lang.String> details, java.lang.String email, int cmid) {
    java.lang.String status = getStatus(details);
    java.lang.String currentEmail = details.get("email_address");
    if (currentEmail.equals(email)) {
        return status.equals("verifying email");
    }else {
        return (getUserByMail(email)) == null;
    }
}