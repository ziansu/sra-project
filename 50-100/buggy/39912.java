public static int GCD(int a, int b) {
    a = java.lang.Math.abs(a);
    b = java.lang.Math.abs(b);
    if (a < b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    if (0 == b) {
        return a;
    }
    return com.example.caoya.mathtools.subject.Fraction.GCD((a - b), b);
}