private apcs.economics.Point[] addPointToEndOfCurve(apcs.economics.Point point) {
    apcs.economics.Point[] newCurve = new apcs.economics.Point[(this.curvePoints.length) + 1];
    newCurve[((newCurve.length) - 1)] = point;
    for (int x = 0; x < ((newCurve.length) - 1); x++) {
        newCurve[x] = this.curvePoints[x];
    }
    return newCurve;
}