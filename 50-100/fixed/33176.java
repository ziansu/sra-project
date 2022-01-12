private void getUserID() {
    userID = getStr();
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(STX\\)(.+?)\\(ETX\\)").matcher(userID);
    matcher.find();
    userID = ((java.lang.String) (userID.subSequence(0, matcher.start(0))));
    checkUserID();
    synchronized(usersL) {
        usersL.put(mySocket, userID);
    }
}