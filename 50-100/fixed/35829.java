public static void main(java.lang.String[] args) {
    for (int i = 0; i <= (Main.iterationen); i++) {
        if (i == 0) {
            Main.result = ((int) (Main.laenge));
            continue;
        }
        float L = Main.calcL(i);
        int N = Main.calcN(i);
        Main.result += L * N;
    }
    java.lang.System.out.println(("Ergebnis: " + (Main.result)));
}