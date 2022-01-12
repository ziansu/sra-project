void GenerateShipsOnTheField(int[][] field) {
    PutNDeckShip(field, 4);
    for (int i = 1; i <= 2; i++) {
        PutNDeckShip(field, 3);
    }
    for (int i = 1; i <= 3; i++) {
        PutNDeckShip(field, 2);
    }
    Put1DeckShip4Times(field);
}