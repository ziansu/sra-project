private int findLineStart(int insertLoc) {
    char[] contents = unit.getContents();
    while (((insertLoc > 0) && ((contents[insertLoc]) != '\n')) && ((contents[insertLoc]) != '\r')) {
        insertLoc--;
    } 
    return insertLoc;
}