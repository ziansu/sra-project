private void resetState() {
    joiningFractions = new float[(pageCount) == 0 ? 0 : (pageCount) - 1];
    java.util.Arrays.fill(joiningFractions, 0.0F);
    dotRevealFractions = new float[pageCount];
    java.util.Arrays.fill(dotRevealFractions, 0.0F);
    retreatingJoinX1 = com.pixelcan.inkpageindicator.InkPageIndicator.INVALID_FRACTION;
    retreatingJoinX2 = com.pixelcan.inkpageindicator.InkPageIndicator.INVALID_FRACTION;
    selectedDotInPosition = true;
}