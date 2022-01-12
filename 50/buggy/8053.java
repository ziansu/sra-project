private static void setEmailLastSentDate() throws java.lang.Exception {
    keepinchecker.database.entity.User user = new keepinchecker.database.entity.User();
    user.setEmailLastSentDate(new java.util.Date().getTime());
    keepinchecker.utility.EmailUtilities.userManager.saveUser(user);
}