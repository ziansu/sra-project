public void draw(com.logicalfallacy.shooter00.Batch batch) {
    for (int i = 0; i < 9; i++) {
        batch.draw(_texture_back, 0, _y_back[i], _tileWidth, _tileHeight);
    }
    for (int i = 0; i < 9; i++) {
        batch.draw(_texture_fore, 0, _y_fore[i], _tileWidth, _tileHeight);
    }
}