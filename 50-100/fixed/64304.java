public static java.lang.String decToHexR(int n) {
    if (n < 16) {
        return "" + (Hexadecimal.chooseHex(n));
    }
    return (Hexadecimal.decToHexR((n / 16))) + ("" + (Hexadecimal.chooseHex((n % 16))));
}