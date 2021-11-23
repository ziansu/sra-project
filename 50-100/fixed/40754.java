public static int getDifficulty(int score) {
    double y;
    double x = ((double) (score));
    if (x > 0)
        y = 1 + (2 * (java.lang.Math.log(x)));
    else
        y = 1;
    
    return ((int) (y));
}