public java.lang.String toString() {
    checkRep();
    java.lang.String puzzle = "";
    for (int i = 0; i <= (size); i++) {
        for (int j = 0; j <= (size); j++) {
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