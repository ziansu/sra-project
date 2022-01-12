public Image drawPts(java.util.List<Point> points) {
    ImagePlus imp = this.getImagePlus();
    ImageProcessor ip = imp.getProcessor();
    for (Point pt : points) {
        ip.fillOval((((int) (pt.x)) - 2), (((int) (pt.y)) - 2), 4, 4);
    }
    return new Image(ip);
}