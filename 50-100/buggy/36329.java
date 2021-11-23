@java.lang.Override
public void onPressed(data.Point pos, data.PixelState startPosPixel, boolean clear) {
    this.startPosPixel = startPosPixel;
    this.clear = clear;
    freeline = new drawcommand.FreelineDrawCommand(clear, canvasController);
    drawcommand.LineDrawCommand startPoint = new drawcommand.LineDrawCommand(pos, pos, startPosPixel, clear, canvasController);
    startPoint.execute();
    freeline.addLine(startPoint);
    prevPos = data.Point.DUMMY_POINT;
}