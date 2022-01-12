private int colorValue(java.lang.Double val, java.lang.Double min, java.lang.Double max) {
    int cVal = ((int) (((val - min) * ((myClasses.GraphicalTopMap.COLORMAX) - (myClasses.GraphicalTopMap.COLORMIN))) / (max - min))) + (myClasses.GraphicalTopMap.COLORMIN);
    cVal = cVal % (myClasses.GraphicalTopMap.COLORBITDEPTH);
    cVal = java.lang.Math.abs(cVal);
    return cVal;
}