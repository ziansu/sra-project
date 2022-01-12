public java.lang.String stars(int n) {
    java.lang.String a = "";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++)
            a += "*";
        
        a += "\n";
    }
    return a;
}