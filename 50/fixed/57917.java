private double sceneToWorldX(double x) {
    double wx = ((x - ((cvs.getWidth()) / 2)) / (scale)) - (translateX);
    return wx;
}