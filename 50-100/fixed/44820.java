public static void main(java.lang.String[] args) {
    java.lang.Integer largestCollatz = 0;
    int maxLength = 1;
    for (java.lang.Integer i = 1000000; i > 0; i--) {
        nl.hkolvoort.euler.P014_Collatz col = new nl.hkolvoort.euler.P014_Collatz(i);
        if ((col.getLength()) > maxLength) {
            largestCollatz = i;
            maxLength = col.getLength();
        }
    }
    java.lang.System.out.println(new nl.hkolvoort.euler.P014_Collatz(largestCollatz).getCollatzSequence());
}