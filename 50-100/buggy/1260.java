private float computeAverageValue(final short[] data, final int index) {
    float average = 0;
    for (int j = 0; j < (mNumberDataForAverage); j++) {
        average += (data[((index * (mNumberDataForAverage)) + j)]) / ((float) ((java.lang.Short.MAX_VALUE) / 2));
    }
    return average / (mNumberDataForAverage);
}