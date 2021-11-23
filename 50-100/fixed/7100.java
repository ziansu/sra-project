private final void drawGrid(android.graphics.Canvas canvas, float offset, int min) {
    for (int i = 0; i < ((com.gmail.wazappdotgithub.ships.common.Constants.DEFAULT_BOARD_SIZE) + 1); i++) {
        float itimeso = i * offset;
        canvas.drawLine(0, itimeso, min, itimeso, com.gmail.wazappdotgithub.ships.model.views.BoardView.foregroundPaint);
        canvas.drawLine(itimeso, 0, itimeso, min, com.gmail.wazappdotgithub.ships.model.views.BoardView.foregroundPaint);
    }
    canvas.drawLine((min - 1), 0, (min - 1), min, com.gmail.wazappdotgithub.ships.model.views.BoardView.foregroundPaint);
}