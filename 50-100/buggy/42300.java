public static boolean placeTile(model.Tile tile, int qValue, model.Scoring score) {
    if (((tile.getText()) == "") && (model.TileBehavior.hasNeighbors(tile))) {
        if (model.TileBehavior.checkNeighbors(tile, qValue)) {
            score.setScore(tile);
            model.TileBehavior.resetNeighbors(tile);
        }else {
            tile.setNumber(qValue);
            tile.setText(("" + qValue));
        }
        return true;
    }
    return false;
}