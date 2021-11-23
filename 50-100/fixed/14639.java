public void calcRight() {
    double sum = 0;
    for (double i = (minInt) + (getIncrement()); (roundNumber(i)) <= (maxInt); i += getIncrement()) {
        sum += (getIncrement()) * (calcEquation(i));
        addTextToSpreadsheet(i, calcEquation(i));
    }
    setAnswer(sum);
}