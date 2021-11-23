public static int hexToDecR(java.lang.String s) {
    if ((s.length()) == 1) {
        return Hexadecimal.chooseDec(s);
    }
    return (16 * (Hexadecimal.hexToDecR(s.substring(0, ((s.length()) - 1))))) + (Hexadecimal.chooseDec(s.substring(((s.length()) - 1))));
}