public void createRandomFences() {
    for (int i = 0; i < 12; i++) {
        while (true) {
            int x = hivolts.Square.random2();
            int y = hivolts.Square.random2();
            if ((field[x][y]) == null) {
                field[x][y] = new hivolts.Fence(x, y);
                java.lang.System.out.println("randoms");
                break;
            }
        } 
    }
}