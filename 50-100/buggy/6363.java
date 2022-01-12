private static double phi(int j) {
    double x = 0.0;
    double f = 0.5;
    while (j != 0) {
        x += f * ((double) (j & 1));
        j /= 2;
        f *= 0.5;
    } 
    return x;
}