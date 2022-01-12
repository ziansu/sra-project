public void calcMiddle() {
    double sum = 0;
    for (double i = ((minInt) + (getIncrement())) / 2.0; (roundNumber(i)) < (maxInt); i += getIncrement()) {
        sum += (getIncrement()) * (calcEquation(i));
        addTextToSpreadsheet(i, calcEquation(i));
    }
    setAnswer(sum);
}