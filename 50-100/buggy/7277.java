public int getScrollHeight() {
    return ((int) (((float) ((dragged) / ((float) ((height) - (BAR_HEIGHT))))) * ((height) - (viewportHeight))));
}