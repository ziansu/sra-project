public static void placeTile(model.Tile tile, int qValue, model.Scoring score) {
    if (model.TileBehavior.checkNeighbors(tile, qValue)) {
        score.setScore(tile);
        model.TileBehavior.resetNeighbors(tile);
    }else {
        tile.setNumber(qValue);
        tile.setText(("" + qValue));
    }
}