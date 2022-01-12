public static void main(java.lang.String[] args) {
    Map apple2 = new Map("2apples.txt");
    Map apple10 = new Map("10apples.txt");
    NearestNeighbor solve2 = new NearestNeighbor(apple2);
    NearestNeighbor solve10 = new NearestNeighbor(apple10);
    solve2.solve();
    solve10.solve();
    java.lang.System.out.println(sovle2.getDist());
    java.lang.System.out.println(sovle10.getDist());
}