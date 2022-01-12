private java.lang.String readLine() {
    java.lang.String tmp = null;
    if (getNewline) {
        try {
            tmp = forReading.readLine();
            (lineIndex)++;
            wordIndex = 0;
            splitLine = null;
        } catch (java.io.IOException e) {
            java.lang.System.err.println("ERROR reading from file!");
            e.printStackTrace();
        }
    }
    if (tmp == null) {
        atEOF = true;
        getNewline = false;
        return null;
    }else {
        getNewline = true;
        return tmp;
    }
}