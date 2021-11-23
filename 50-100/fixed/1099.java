public java.lang.String skipCurrentLine() {
    java.lang.String skippedLine;
    if (quotedValueLines.isEmpty()) {
        skippedLine = line;
    }else {
        skippedLine = quotedValueLines.remove(0);
        unreadLines.addAll(quotedValueLines);
        if ((line) != null) {
            unreadLines.add(line);
        }
        lineNumber -= quotedValueLines.size();
        quotedValueLines.clear();
    }
    recordState = org.embulk.standards.CsvTokenizer.RecordState.END;
    return skippedLine;
}