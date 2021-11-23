public void parseBare(java.util.Scanner scanner) {
    java.lang.String str;
    for (int i = 0; i < 9; ++i) {
        str = scanner.next();
        for (int k = 0; k < 9; ++k) {
            setNum(k, i, ((str.charAt(k)) - '0'));
        }
    }
}