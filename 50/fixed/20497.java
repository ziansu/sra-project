public void setHighlighted(boolean highlighted) {
    if ((this.isHighlighted) != highlighted) {
        isHighlighted = highlighted;
        refreshDrawableState();
    }
}