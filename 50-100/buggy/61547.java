public int getMedian(java.util.ArrayList<java.lang.Integer> values) {
    int middle = (values.size()) / 2;
    if (((values.size()) % 2) == 1) {
        return values.get(middle);
    }else {
        return ((values.get(middle)) + (values.get((middle - 1)))) / 2;
    }
}