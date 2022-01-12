public int basicInterpolateColor(int fromColor, int toColor, double bias) {
    if (logIndex) {
        return basicInterpolateIndex(indexOfColor(fromColor), indexOfColor(toColor), bias);
    }else {
        if (fromColor > toColor) {
            int tmpIndex = fromColor;
            fromColor = toColor;
            toColor = tmpIndex;
        }
        return getColor((fromColor + (java.lang.Math.round(((float) ((java.lang.Math.abs((toColor - fromColor))) * bias))))));
    }
}