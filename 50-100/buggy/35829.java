public static void main(java.lang.String[] args) {
    for (int i = 0; i <= (Main.iterationen); i++) {
        if ((Main.iterationen) == 0) {
            Main.result = Main.laenge;
            continue;
        }
        int L = Main.calcL(i);
        int N = Main.calcN(i);
        Main.result = L * N;
    }
    java.lang.System.out.println(("Ergebnis: " + (Main.result)));
}