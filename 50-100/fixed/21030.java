public void move(java.lang.String s) {
    if (s.equals("A")) {
        if (((x) - 1) >= 0) {
            (x)--;
        }
    }else
        if (s.equals("D")) {
            if (((x) + 1) < (TextGame.COLUMNS)) {
                (x)++;
            }
        }
    
}