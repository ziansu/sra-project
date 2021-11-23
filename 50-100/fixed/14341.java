private void reduceColor() throws java.lang.Exception {
    int newColor;
    int myColor = getColorBitInt();
    int diffInd = (node.isRoot(forestLabel)) ? 0 : getParentDiffIndex();
    int x = ((int) (java.lang.Math.pow(2, ((double) (diffInd)))));
    int bitValue = ((myColor & x) > 0) ? 1 : 0;
    newColor = (concatBitToNum(diffInd, bitValue)) + 1;
    setColorBitInt(newColor);
}