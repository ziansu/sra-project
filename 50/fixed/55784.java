@java.lang.Override
public void modScale(org.randoom.setlx.utilities.Canvas canvas, double xMin, double xMax, double yMin, double yMax) {
    canvas.getFrame().modyScale(yMin, yMax);
    canvas.getFrame().modxScale(xMin, xMax);
}