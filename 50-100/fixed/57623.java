public boolean addValue(java.lang.String key, double value) {
    org.diyefi.openlogviewer.genericlog.GenericDataElement logElement = this.get(key);
    if (key.equals(firstKey)) {
        lineCountElement.add(((double) (lineCount)));
        (lineCount)++;
    }
    return logElement.add(value);
}