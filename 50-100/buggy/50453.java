public boolean isTriggered(java.lang.String userInput) {
    userResponse = userInput;
    java.lang.String lastChar = "" + (userResponse.charAt(((userResponse.length()) - 1)));
    if (((containsNo(userResponse)) && (containsNo(responseBefore))) && ((questionCount) >= 1)) {
        return true;
    }else
        if ((lastChar.equals("?")) && (userResponse.equals(Main.prevResponse))) {
            return true;
        }
    
    return false;
}