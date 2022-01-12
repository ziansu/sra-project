public java.lang.Double[] getOrientation() {
    java.util.ArrayList<java.lang.Double> tmpOrientation = orientationBuffer.remove(0);
    java.lang.Double[] orientation = new java.lang.Double[7];
    for (int i = 0; i < 7; i++) {
        orientation[i] = tmpOrientation.remove(0);
    }
    return orientation;
}