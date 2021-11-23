@java.lang.Override
public void accept(java.lang.Integer combinedValue) throws java.lang.Exception {
    if ((!(resetting)) && (combinedValue < (lastValue))) {
        cellOutputSubject.onNext(new com.scrawlsoft.brailler.Cell(lastValue));
        resetting = true;
    }
    if (!(resetting)) {
        lastValue = combinedValue;
    }
    if (combinedValue == 0) {
        resetting = false;
        lastValue = 0;
    }
}