@org.python.Method(__doc__ = "")
public org.python.Object isalpha() {
    int c = 0;
    java.lang.String checkString = this.value;
    char currentCharacter;
    while (c < ((checkString.length()) - 1)) {
        currentCharacter = checkString.charAt(c);
        if (!(java.lang.Character.isLetter(currentCharacter))) {
            return new org.python.types.org.python.types.Bool(false);
        }
        c++;
    } 
    return new org.python.types.org.python.types.Bool(true);
}