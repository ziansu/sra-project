private boolean isBoolean(java.lang.String input) {
    boolean isBoolean = false;
    try {
        boolean monster = java.lang.Boolean.parseBoolean(input);
        isBoolean = true;
    } catch (java.lang.NumberFormatException error) {
        myOutput.showResponse("Not a Boolean - Bad value will be used.");
    }
    return isBoolean;
}