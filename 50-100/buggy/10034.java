private hudson.plugins.timestamper.annotator.ConsoleLogParser.Result parseFromFinish(java.io.InputStream inputStream) throws java.io.IOException {
    hudson.plugins.timestamper.annotator.ConsoleLogParser.Result result = new hudson.plugins.timestamper.annotator.ConsoleLogParser.Result();
    int value = inputStream.read();
    result.atNewLine = isNewLine(value);
    while ((value = inputStream.read()) != (-1)) {
        if (isNewLine(value)) {
            (result.lineNumber)--;
        }
    } 
    return result;
}