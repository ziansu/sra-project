public static void main(java.lang.String[] args) {
    Board b = new Board();
    for (int a = 0; a < 10; a++) {
        b.newTile();
    }
    java.lang.System.out.println("Initial Board:");
    java.lang.System.out.println(b.printBoard());
    b.addTiles('a');
    java.lang.System.out.println("Added Left:");
    java.lang.System.out.println(b.printBoard());
}