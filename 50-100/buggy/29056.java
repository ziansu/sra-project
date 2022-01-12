public models.DPair getBasePrintCoords(double x, double y, models.Pair localOffset) {
    double xCoord = x * ((bodyWidth) + (sideWidth));
    double yCoord = ((y * (height)) + ((height) / 2)) - ((x * (height)) / 2);
    return new models.DPair(xCoord, yCoord);
}