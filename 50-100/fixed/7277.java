public int getScrollHeight() {
    return ((int) (((float) ((dragged) / ((float) ((viewportHeight) - (BAR_HEIGHT))))) * ((height) - (viewportHeight))));
}