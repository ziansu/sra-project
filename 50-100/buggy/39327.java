public java.lang.String getString() {
    java.lang.String str = "";
    for (int i = 0; i < (current.length); i++) {
        for (int j = 0; j < (current[i].length); j++) {
            str += java.lang.String.valueOf(current[i][j]);
            java.lang.System.out.print(((current[i][j]) + " "));
        }
        java.lang.System.out.println();
    }
    return str;
}