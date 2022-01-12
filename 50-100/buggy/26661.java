private boolean parseArrayOperation() {
    if (splitString.isEmpty()) {
        return true;
    }
    java.lang.String currentElement = splitString.getCurrentElement();
    if ((currentElement.equals("+")) || (currentElement.equals("*"))) {
        splitString.nextPosition();
        return parseArrayOrNumber();
    }
    return true;
}