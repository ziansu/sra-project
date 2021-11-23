public static int isqrt(int number) {
    int x = 6 * (com.michael.api.math.ApiMath.power(10, 2));
    int n;
    while (true) {
        n = (x + (number / x)) / 2;
        if (n == x) {
            break;
        }
        if (n > x) {
            break;
        }
        x = n;
    } 
    return x;
}