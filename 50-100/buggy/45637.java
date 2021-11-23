private apcs.economics.Point[] addPointToBeginningOfCurve(apcs.economics.Point point) {
    apcs.economics.Point[] newCurve = new apcs.economics.Point[(this.curvePoints.length) + 1];
    newCurve[0] = point;
    for (int x = 1; x < (newCurve.length); x++) {
        newCurve[x] = this.curvePoints[(x - 1)];
    }
    return newCurve;
}