public java.lang.String toString() {
    checkRep();
    java.lang.String puzzle = "";
    for (int i = 1; i <= (size); i++) {
        for (int j = 1; j <= (size); j++) {
            if ((square[i][j]) == 0) {
                puzzle += ".";
            }else
                puzzle += square[i][j];
            
        }
        puzzle += "\n";
    }
    checkRep();
    return puzzle;
}