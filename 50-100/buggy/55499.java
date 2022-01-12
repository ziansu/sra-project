private java.lang.String readLine() {
    java.lang.String tmp = null;
    if (getNewline) {
        try {
            tmp = forReading.readLine();
            (lineIndex)++;
            wordIndex = 0;
            splitLine = null;
            getNewline = false;
        } catch (java.io.IOException e) {
            java.lang.System.err.println("ERROR reading from file!");
            e.printStackTrace();
        }
    }
    if (tmp == null) {
        atEOF = true;
        return null;
    }else {
        getNewline = true;
        return tmp;
    }
}