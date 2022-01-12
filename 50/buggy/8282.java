public char getNextChar() {
    if ((currentChar) == '\n')
        (row)++;
    else
        (col)++;
    
    return currentChar;
}