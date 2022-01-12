private boolean parseArrayOperation() {
    if (!(splitString.isEmpty())) {
        java.lang.String currentElement = splitString.getCurrentElement();
        if ((currentElement.equals("+")) || (currentElement.equals("*"))) {
            splitString.nextPosition();
            return parseArrayOrNumber();
        }
    }
    return true;
}