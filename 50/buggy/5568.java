public static void main(java.lang.String[] args) {
    SPA spa = new SPA();
    spa.read("spa.txt");
    Match match = spa.solve();
    java.lang.System.out.print(match);
}