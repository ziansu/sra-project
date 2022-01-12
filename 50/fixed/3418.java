private boolean isBoolean(java.lang.String input) {
    boolean isBoolean = false;
    if (false == (java.lang.Boolean.parseBoolean(input))) {
        myOutput.showResponse("Not a Boolean - Bad value will be used.");
    }else {
        isBoolean = true;
    }
    return isBoolean;
}