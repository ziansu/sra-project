public static int isqrt(int number) {
    int x = (java.lang.Integer.toString(number).length()) * (com.michael.api.math.ApiMath.power(10, 2));
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