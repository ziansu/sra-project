public java.util.Scanner getScanner() {
    if ((_scanner) == null)
        setScanner(new java.util.Scanner(java.lang.System.in));
    
    return _scanner;
}