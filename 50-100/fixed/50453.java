public boolean isTriggered(java.lang.String userInput) {
    userResponse = userInput;
    java.lang.String lastChar = "" + (userResponse.charAt(((userResponse.length()) - 1)));
    if ((lastChar.equals("?")) && (userResponse.equals(Main.prevResponse))) {
        return true;
    }else
        if ((((questionCount) >= 1) && (containsNo(userResponse))) || (containsNo(Main.prevResponse))) {
            return true;
        }
    
    return false;
}