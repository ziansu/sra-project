private void generateAllMultiplikation() {
    java.lang.StringBuffer bufa = new java.lang.StringBuffer();
    for (int a = 0; a < 10; a++)
        for (int b = 0; b < 10; b++) {
            append(bufa, a);
            append(bufa, b);
        }
    
    aufgaben = bufa.toString();
}