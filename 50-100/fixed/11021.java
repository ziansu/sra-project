private static int getMinMatchingLabel(LabeledNeighbor[] neighbors, byte currentColorValue) {
    int minMatchingLabel = java.lang.Integer.MAX_VALUE;
    for (LabeledNeighbor neighbor : neighbors) {
        int label = neighbor.getLabel();
        if (((label > 0) && (label < minMatchingLabel)) && (currentColorValue == (neighbor.getColor()))) {
            minMatchingLabel = label;
        }
    }
    if (minMatchingLabel != (java.lang.Integer.MAX_VALUE)) {
        return minMatchingLabel;
    }else {
        return 0;
    }
}