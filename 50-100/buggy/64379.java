public boolean sendEmail(java.lang.String targetEmail, java.lang.String text, java.lang.String userName, java.lang.String region) {
    java.lang.String emailServerLocation = com.riotgames.education.cnu.example.refactoring.EmailManager.getAvailableEmailServerLocation(region);
    if (emailServerLocation != null) {
        if (userName.startsWith(reservedName)) {
            return false;
        }
        sendEmail(targetEmail, text);
        return true;
    }else {
        return false;
    }
}