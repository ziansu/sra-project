public int getTaskId(boolean throwException) {
    java.util.ArrayList<java.lang.String> allPhrases = this.getAllPhrases();
    int listPointer = this.getListPointer();
    java.lang.String currentPhrase = allPhrases.get(listPointer);
    try {
        int returnValue = (java.lang.Integer.parseInt(currentPhrase)) - 1;
        return returnValue;
    } catch (java.lang.NumberFormatException e) {
        if (throwException) {
            java.lang.NumberFormatException e2 = new java.lang.NumberFormatException("ID for editing task is not valid.");
            java.lang.System.out.println(e2);
            throw e2;
        }else {
            return -1;
        }
    }
}