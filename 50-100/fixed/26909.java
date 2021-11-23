private int findLineStart(int insertLoc) {
    char[] contents = unit.getContents();
    while (((insertLoc > 0) && ((contents[(insertLoc - 1)]) != '\n')) && ((contents[(insertLoc - 1)]) != '\r')) {
        insertLoc -= 1;
    } 
    return insertLoc;
}