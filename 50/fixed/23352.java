private int getPitchHeight(int height, int length) {
    int cellHeight = (height - (cs3500.music.view.EditorPanel.START_HEIGHT)) / length;
    if (cellHeight < 20) {
        return 20;
    }
    return cellHeight;
}