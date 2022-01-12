public void configureBoard(int widthMax, int heightMax) {
    model.Board.gridMaxWidth = widthMax;
    model.Board.gridMaxHeight = heightMax;
    grid = new model.Grid[model.Board.gridMaxWidth][model.Board.gridMaxHeight];
    for (int i = 0; i < (model.Board.gridMaxHeight); i++) {
        for (int j = 0; j < (model.Board.gridMaxWidth); j++) {
            isFilled[j][i] = false;
        }
    }
}