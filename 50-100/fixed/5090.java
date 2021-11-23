private boolean scoreDifference(int score) {
    boolean b = false;
    for (int i = 0; i < (scoresArray.size()); i++) {
        if ((diffToWin) != 0) {
            if ((java.lang.Math.abs((score - (java.lang.Integer.valueOf(java.lang.String.valueOf(scoresArray.get(i))))))) >= (diffToWin)) {
                b = true;
            }
        }
    }
    return b;
}