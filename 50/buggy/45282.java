public iguana.utils.input.PositionInfo getPositionInfo(int leftExtent, int rightExtent) {
    return new iguana.utils.input.PositionInfo(leftExtent, (rightExtent - leftExtent), getLineNumber(leftExtent), getColumnNumber(leftExtent), getLineNumber(rightExtent), getColumnNumber(rightExtent), uri);
}