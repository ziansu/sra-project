public void repeatedBAstar() {
    java.util.List<java.lang.Integer> tmp = startPoint;
    startPoint = targetPoint;
    start = targetPoint;
    targetPoint = tmp;
    repeatedFAstar();
    tmp = start;
    start = targetPoint;
    startPoint = start;
    targetPoint = tmp;
}