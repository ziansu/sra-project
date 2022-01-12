public void calcLeft() {
    double sum = 0;
    for (double i = minInt; (roundNumber(i)) < (maxInt); i += getIncrement()) {
        sum += roundNumber(((getIncrement()) * (calcEquation(i))));
        addTextToSpreadsheet(i, calcEquation(i));
    }
    setAnswer(sum);
}