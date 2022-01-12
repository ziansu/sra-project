public gab.opencv.PVector getAverageFlowInRegion(int x, int y, int w, int h) {
    gab.opencv.PVector total = getTotalFlowInRegion(x, y, w, h);
    return new gab.opencv.PVector(((total.x) / ((flow.width()) * (flow.height()))), ((total.y) / ((flow.width()) * (flow.height()))));
}