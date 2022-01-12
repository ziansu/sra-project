@java.lang.Override
public char[] getNextChars(int amount) {
    if ((text.length()) <= (currentPosInCharsOfText)) {
        return null;
    }else
        if (((currentPosInCharsOfText) + amount) >= (text.length())) {
            amount = (text.length()) - (currentPosInCharsOfText);
        }
    
    java.lang.String s = text.substring(currentPosInCharsOfText, ((currentPosInCharsOfText) + amount));
    currentPosInCharsOfText += amount;
    return s.toCharArray();
}