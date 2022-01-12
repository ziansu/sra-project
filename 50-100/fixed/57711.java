private void setTopPoint() {
    topPointX = ((-(b)) / (a)) / 2;
    topPointY = f(topPointX);
    ceiledTopPointX = ((short) (java.lang.Math.ceil(topPointX)));
    ceiledTopPointY = ((short) (java.lang.Math.ceil(topPointY)));
}