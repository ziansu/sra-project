public gab.opencv.PVector getAverageFlowInRegion(int x, int y, int w, int h) {
    gab.opencv.PVector total = getTotalFlowInRegion(x, y, w, h);
    return new gab.opencv.PVector(((total.x) / (w * h)), ((total.y) / (w * h)));
}