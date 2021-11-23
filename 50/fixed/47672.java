public java.lang.String toString() {
    java.lang.String ans = "";
    for (int i = 0; i < (getHeight()); i++) {
        ans += (getLevel(i)) + "\n";
    }
    return ans;
}