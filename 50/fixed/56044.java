private void moving(double d, double e, double rotate) {
    if ((movingFunction) != null)
        movingFunction.apply(d, e, rotate);
    
}