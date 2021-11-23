@java.lang.Override
public void setCoreIndex(int no) {
    if ((no < 0) || (no >= (core.size()))) {
        throw new java.lang.IllegalArgumentException(("Invalid series: " + no));
    }
    coreIndex = no;
    series = coreIndexToSeries(no);
}