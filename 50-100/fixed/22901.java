public apcs.economics.Point[] deletePointInCurve(int index) {
    apcs.economics.Point[] temp = null;
    if ((index >= 0) && (index < (this.curvePoints.length))) {
        if (index == 0) {
            temp = deletePointAtBeginningOfCurve();
        }else
            if (index == ((this.curvePoints.length) - 1)) {
                temp = deletePointAtEndOfCurve();
            }else {
                temp = deletePointAtMiddleOfCurve(index);
            }
        
    }
    return temp;
}