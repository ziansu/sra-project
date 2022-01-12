public void getLimits() {
    int sum = 0;
    for (java.awt.Point item : data) {
        limitLeft = java.lang.Math.min(limitLeft, item.y);
        limitRight = java.lang.Math.max(limitRight, item.y);
        limitTop = java.lang.Math.min(limitTop, item.x);
        limitBelow = java.lang.Math.max(limitBelow, item.x);
        sum += item.y;
    }
    centerOfShape = sum / (data.size());
}