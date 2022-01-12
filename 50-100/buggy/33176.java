private void getUserID() {
    userID = new java.lang.String(getStr().getBytes(java.nio.charset.StandardCharsets.UTF_8));
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(STX\\)(.+?)\\(ETX\\)").matcher(userID);
    matcher.find();
    userID = ((java.lang.String) (userID.subSequence(0, matcher.start(0))));
    checkUserID();
    synchronized(usersL) {
        usersL.put(mySocket, userID);
    }
}