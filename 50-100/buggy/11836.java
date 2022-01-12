private void findPercentiles() {
    int count = 0;
    lowerIndex = 0;
    for (lowerIndex = 0; (lowerIndex) < (histogram.length); (lowerIndex)++) {
        count += histogram[lowerIndex];
        if (count >= (lowerCount)) {
            break;
        }
    }
    for (upperIndex = lowerIndex; (upperIndex) < (histogram.length); (upperIndex)++) {
        count += histogram[upperIndex];
        if (count >= (upperCount)) {
            break;
        }
    }
}