void GenerateShipsOnTheField(int[][] f) {
    PutNDeckShip(f, 4);
    for (int i = 1; i <= 2; i++) {
        PutNDeckShip(f, 3);
    }
    for (int i = 1; i <= 3; i++) {
        PutNDeckShip(f, 2);
    }
    Put1DeckShip4Times(f);
}