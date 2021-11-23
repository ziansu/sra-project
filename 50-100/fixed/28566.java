private void findSubIndexForColor(int topIndex, int color) {
    if (((mColorsSub) == null) || (((mColorsSub.length) - 1) < topIndex))
        return ;
    
    int[] subColors = mColorsSub[topIndex];
    for (int subIndex = 0; subIndex < (subColors.length); subIndex++) {
        if ((subColors[subIndex]) == color) {
            subIndex(subIndex);
            break;
        }
    }
}