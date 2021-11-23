public void debugPrintBoard() {
    for (int yRow = 1; yRow <= (Game.LENGTH); ++yRow) {
        java.lang.System.out.print("  ");
        for (int xCol = 1; xCol <= (Game.LENGTH); ++xCol) {
            char val = boardMap.get(org.javatuples.Pair.with(xCol, yRow));
            java.lang.System.out.print((val + " "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.print("\n\n");
}