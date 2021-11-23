public double insertionTravelTime() {
    if (isInsertComputed) {
        computeInsert();
    }
    return insertTravelTime;
}