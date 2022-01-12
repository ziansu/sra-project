public static java.lang.String stringValue(int n, int base) {
    if (n < 0)
        return Main.stringValue((-n), base);
    
    if (n == 0) {
        return "";
    }else {
        return (Main.stringValue((n / base), base)) + ("0123456789".charAt((n % base)));
    }
}