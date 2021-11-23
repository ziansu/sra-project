protected java.lang.String readName() {
    java.lang.String name = "";
    while (((java.lang.Character.isDigit(currentchar)) || (java.lang.Character.isLetter(currentchar))) || ((currentchar) == '_')) {
        advancePosition();
        name += currentchar;
    } 
    return name;
}