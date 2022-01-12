public java.lang.String ReadLine() {
    java.lang.String content = null;
    super.ReadLine();
    try {
        if (null == (reader)) {
            return null;
        }
        java.io.LineNumberReader tmpReader = ((java.io.LineNumberReader) (reader));
        tmpReader.setLineNumber(lineNumber);
        content = ((java.io.LineNumberReader) (reader)).readLine();
        lineNumber = tmpReader.getLineNumber();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    return content;
}