public double getAverageHopes() {
    double averageHopes = 0.0;
    for (SuccessQuery sq : successQueryList) {
        int tempHops = sq.getHops();
        averageHopes += tempHops;
    }
    return averageHopes / (successQueryList.size());
}