public java.lang.String toString() {
    java.lang.String string = "";
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            string = string.concat(java.lang.Integer.toString(cells[i][j].value));
        }
    }
    return string;
}