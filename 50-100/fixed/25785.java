private synchronized void convertToScreenCoordinates(com.gmail.claytonrogers53.life.Graphics.Drawing inputDrawing) {
    inputDrawing.xPosition -= panX;
    inputDrawing.yPosition -= panY;
    inputDrawing.xPosition *= zoom;
    inputDrawing.yPosition *= zoom;
    inputDrawing.xPosition += (width) / 2.0;
    inputDrawing.yPosition *= -1;
    inputDrawing.yPosition += (height) / 2.0;
    inputDrawing.spriteZoom *= zoom;
}