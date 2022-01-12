static int getChangeAmount(float price, float given) {
    double change = (given - price) * 100.0;
    return ((int) (java.lang.Math.round(change)));
}