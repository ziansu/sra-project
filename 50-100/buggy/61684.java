public boolean checkCondForResendMail(java.util.HashMap<java.lang.String, java.lang.String> details, java.lang.String email, int cmid) {
    java.lang.String status = getStatus(details);
    java.lang.String currentEmail = details.get("email_address");
    if (currentEmail.equals(email)) {
        if (status.equals("verifying email"))
            return true;
        else
            return false;
        
    }else {
        if ((getUserByMail(email)) == null)
            return true;
        else
            return false;
        
    }
}