public double getAvregeUphillDegree() {
    double result;
    double sum = 0;
    int num = 0;
    for (double slop : degreesArray) {
        if (slop != 0) {
            num++;
            sum += slop;
        }
    }
    if (num == 0) {
        return 0;
    }
    result = sum / num;
    return result;
}