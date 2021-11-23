public static int getTailleFont(last2048.Last2048.Tuile tuile) {
    int tailleFont;
    if ((0 < (tuile.valeur)) && ((tuile.valeur) < 100)) {
        tailleFont = 36;
    }else
        if ((100 < (tuile.valeur)) && ((tuile.valeur) < 1000)) {
            tailleFont = 32;
        }else {
            tailleFont = 24;
        }
    
    return tailleFont;
}