public java.lang.String toString() {
    java.lang.String ans = "|";
    for (int i = 0; i < 5; i++) {
        ans += Bars.get(((int) (_zip.charAt(i))));
    }
    ans += (Bars.get(_checkDigit)) + "|";
}