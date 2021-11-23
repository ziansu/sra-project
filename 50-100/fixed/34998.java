private void generatePlus() {
    java.lang.StringBuffer bufa = new java.lang.StringBuffer();
    for (int a = 0; a < 21; a++)
        for (int b = 0; b < (21 - a); b++) {
            append(bufa, a);
            append(bufa, b);
        }
    
    aufgaben = bufa.toString();
}