private int getShapeY() {
    if (sizeConstrainedWithWidth()) {
        return (((getPanelHeight()) - (getShapeHeight())) / 2) - (getBorderSize());
    }else {
        return 0;
    }
}