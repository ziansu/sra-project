public boolean addValue(java.lang.String key, double value) {
    org.diyefi.openlogviewer.genericlog.GenericDataElement logElement = this.get(key);
    if (key.equals(firstKey)) {
        (lineCount)++;
        lineCountElement.add(((double) (lineCount)));
    }
    return logElement.add(value);
}