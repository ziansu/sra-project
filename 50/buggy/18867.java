private int positionToX(int position) {
    return position < (gameModel.AREA_DIMENSION) ? position : position % (pokinboroda.andriy.com.foxhunting.model.GameModel.AREA_DIMENSION);
}