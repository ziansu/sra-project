@java.lang.Override
public double getConversionRate(int currency1, int currency2) {
    if ((source) != currency1) {
        doBFS(currency1);
        source = currency1;
    }
    return distTo(currency2);
}