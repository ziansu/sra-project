public int calculateIterativeFib() {
    int n1 = 0;
    int n2 = 1;
    int n3;
    int i;
    int count = 10;
    java.lang.System.out.print(((n1 + " ") + n2));
    for (i = 2; i < count; ++i) {
        n3 = n1 + n2;
        java.lang.System.out.print((" " + n3));
        n1 = n2;
        n2 = n3;
    }
    return count;
}