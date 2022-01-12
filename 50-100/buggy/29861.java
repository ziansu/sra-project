private boolean parseValue(com.microsoft.applicationinsights.internal.perfcounter.UnixParsingState parsingData, java.lang.String line, java.lang.String part) {
    int index = line.indexOf(part);
    if (index != (-1)) {
        line.trim();
        java.lang.String[] strings = line.split(" ");
        parsingData.returnValue += java.lang.Double.valueOf(strings[((strings.length) - 2)]);
        --(parsingData.doneCounter);
        return true;
    }
    return false;
}