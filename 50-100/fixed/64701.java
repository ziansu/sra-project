public int basicInterpolateColor(int fromColor, int toColor, double bias) {
    if (logIndex) {
        return basicInterpolateIndex(indexOfColor(fromColor), indexOfColor(toColor), bias);
    }else {
        return basicInterpolateIndex(fromColor, toColor, bias);
    }
}