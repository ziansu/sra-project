public boolean checkTouch(float coordX, float coordY) {
    return ((coordX >= (offsetX)) && (coordX <= ((offsetX) + (getWidth())))) && ((coordY >= (offsetY)) && (coordY <= ((offsetY) + (getHeight()))));
}