public static int getDifficulty(int score) {
    double y;
    double x = ((double) (score));
    if (x > 0)
        y = 2 * (java.lang.Math.log(x));
    else
        y = 1;
    
    y = java.lang.Math.ceil(y);
    return ((int) (y));
}