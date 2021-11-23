public static void main(java.lang.String[] args) {
    java.util.Map apple2 = new java.util.Map("2apples.txt");
    java.util.Map apple10 = new java.util.Map("10apples.txt");
    NearestNeighbor solve2 = new NearestNeighbor(apple2);
    NearestNeighbor solve10 = new NearestNeighbor(apple10);
    solve2.solve();
    solve10.solve();
    java.lang.System.out.println(solve2.getDist());
    java.lang.System.out.println(solve10.getDist());
}