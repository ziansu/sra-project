private int findHighestRecentOccurenceIndex(lecho.lib.hellocharts.model.Line line, float value, int valueIndex) {
    for (int index = 1; index < (line.getValues().size()); index++) {
        if ((line.getValues().get(index).getY()) == value) {
            if (index <= valueIndex)
                valueIndex = index;
            
        }
    }
    return valueIndex;
}