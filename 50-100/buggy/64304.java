public static java.lang.String decToHexR(int n) {
    if (n < 16) {
        return "" + (chooseHex(n));
    }
    return (Hexadecimal.decToHexR((n / 16))) + ("" + (chooseHex((n % 16))));
}