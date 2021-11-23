@java.lang.Override
public int move() {
    java.util.Random rand = new java.util.Random();
    while (true) {
        int space = rand.nextInt(9);
        if ((board.cells[(space / 3)][(space % 3)]) == (board.EMPTY))
            return space;
        
    } 
}