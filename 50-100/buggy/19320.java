public java.lang.String toString() {
    java.lang.String ans = (_zip) + "      |";
    for (int x = 0; x < (_zip.length()); x++) {
        ans += c[java.lang.Integer.parseInt(_zip.substring(x, (x + 1)))];
    }
    ans += (checkSum()) + "|";
    return ans;
}