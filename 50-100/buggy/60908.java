private boolean parseArrayOrNumber() {
    if (splitString.isEmpty()) {
        return false;
    }
    int startingPosition = splitString.getPosition();
    skipBrackets();
    if (isArray(splitString.getCurrentElement())) {
        splitString.setPosition(startingPosition);
        return parseArrayExpression();
    }else
        if (isNumber(splitString.getCurrentElement())) {
            splitString.setPosition(startingPosition);
            return parseIntExpression();
        }
    
    return false;
}