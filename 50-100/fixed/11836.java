private void findPercentiles() {
    int count = 0;
    lowerIndex = 0;
    for (lowerIndex = 0; ((lowerIndex) < (histogram.length)) && (count < (lowerCount)); (lowerIndex)++) {
        count += histogram[lowerIndex];
    }
    for (upperIndex = lowerIndex; ((upperIndex) < (histogram.length)) && (count < (upperCount)); (upperIndex)++) {
        count += histogram[upperIndex];
    }
}