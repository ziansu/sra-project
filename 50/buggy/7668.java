public void setPoint(apcs.economics.Point point, int index) {
    if ((index < (this.curvePoints.length)) && (index > 0)) {
        this.curvePoints[index] = point;
    }
}