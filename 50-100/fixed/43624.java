protected void draw() {
    switch (fablabView) {
        case MAIN_ROOM :
            drawFablabLayout(canvas);
            drawLocation(canvas, positionX, positionY, false);
            break;
        case ELECTRIC_WORKSHOP :
            drawAcrylicShelf(canvas);
            drawLocation(canvas, positionX, positionY, true);
            break;
        case ACRYLIC_GLAS_SHELF :
            drawAcrylicShelf(canvas);
            drawLocation(canvas, positionX, positionY, true);
            break;
        default :
    }
}