public void parseBare(java.util.Scanner scanner) {
    java.lang.String str;
    int n;
    for (int i = 0; i < 9; ++i) {
        str = scanner.next();
        for (int k = 0; k < 9; ++k) {
            n = (str.charAt(k)) - '0';
            if (n != 0)
                setNum(k, i, n);
            
        }
    }
}