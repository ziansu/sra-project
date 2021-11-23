private void clearHighways() {
    for (int i = 0; i < 119; i++) {
        for (int j = 0; j < 119; j++) {
            this.GridSquares[i][j].memberOfHorizontalHighway = false;
            this.GridSquares[i][j].memberOfVerticalHighway = false;
        }
    }
}