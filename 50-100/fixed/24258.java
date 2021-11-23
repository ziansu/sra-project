protected int getClosestStackIndex(com.github.mikephil.charting.highlight.Range[] ranges, float value) {
    int stackIndex = 0;
    for (com.github.mikephil.charting.highlight.Range range : ranges) {
        if (range.contains(value))
            return stackIndex;
        else
            stackIndex++;
        
    }
    int length = (ranges.length) - 1;
    return value > (ranges[length].to) ? length : 0;
}