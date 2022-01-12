private void drawWindows() {
    drawWindow(((DrawHouse.HOUSE_X) + (DrawHouse.WINDOW_OFFSET_X)), ((DrawHouse.HOUSE_Y) - (DrawHouse.WINDOW_OFFSET_Y)));
    drawWindow(((((DrawHouse.HOUSE_X) + (DrawHouse.HOUSE_WIDTH)) - (DrawHouse.WINDOW_OFFSET_X)) - (DrawHouse.WINDOW_WIDTH)), ((DrawHouse.HOUSE_Y) - (DrawHouse.WINDOW_OFFSET_Y)));
}