private void addPrawns(int column) {
    for (int index = 0; index < (squares[column].length); index++) {
        if (column == 4)
            squares[column][index] = Board.PRAWN_BLACK;
        
        if (column == 1)
            squares[column][index] = Board.PRAWN_WHITE;
        
    }
}