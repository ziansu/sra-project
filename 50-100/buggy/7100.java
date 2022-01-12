private final void drawGrid(android.graphics.Canvas canvas, int offset, int min) {
    for (int i = 0; i < ((com.gmail.wazappdotgithub.ships.common.Constants.DEFAULT_BOARD_SIZE) + 1); i++) {
        int itimeso = i * offset;
        canvas.drawLine(0, itimeso, min, itimeso, com.gmail.wazappdotgithub.ships.model.views.BoardView.foregroundPaint);
        canvas.drawLine(itimeso, 0, itimeso, min, com.gmail.wazappdotgithub.ships.model.views.BoardView.foregroundPaint);
    }
}