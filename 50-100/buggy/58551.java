@java.lang.Override
public java.lang.Double getFractionConsumed() {
    if (doneReading) {
        progressValue.set(1.0);
    }else
        if (((recordReader) == null) || ((recordsReturned) == 0)) {
            progressValue.set(0.0);
        }
    
    if ((progressValue.get()) == 0.0) {
        return null;
    }
    return progressValue.doubleValue();
}