@java.lang.Override
public int move() {
    java.util.Random rand = new java.util.Random();
    while (true) {
        int space = rand.nextInt(9);
        int row = space / 3;
        int col = space % 3;
        if ((board.cells[row][col]) == (board.EMPTY))
            return space;
        
    } 
}