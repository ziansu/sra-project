private void generateSingleMultiplikation(int b) {
    java.lang.StringBuffer bufa = new java.lang.StringBuffer();
    for (int a = 0; a < 10; a++) {
        append(bufa, a);
        append(bufa, b);
    }
    aufgaben = bufa.toString();
}