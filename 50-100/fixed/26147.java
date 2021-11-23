@java.lang.Override
public boolean accept(java.lang.String element) {
    if ((occurrenceCounter.isValid()) && (filter.accept(element))) {
        stringBuffer.append(element).append('\n');
        occurrenceCounter.increment();
    }
    return (occurrenceCounter.isValid()) && (filter.accept(element));
}