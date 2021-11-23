private void generateMinus() {
    java.lang.StringBuffer bufa = new java.lang.StringBuffer();
    for (int a = 0; a < 21; a++)
        for (int b = 0; b <= a; b++) {
            bufa.append(a);
            bufa.append(b);
        }
    
    aufgaben = bufa.toString();
}