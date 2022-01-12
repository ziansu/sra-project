void drawBoard() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if ((model.getSymbol(i, j)) == 'b') {
                drawO('b', i, j);
                java.lang.System.out.println("I got a black move and I draw it!");
            }
            if ((model.getSymbol(i, j)) == 'w') {
                drawO('w', i, j);
                java.lang.System.out.println("I got a white move and I draw it!");
            }
        }
    }
}