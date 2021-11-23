private java.lang.String lineRecur(int currentLine, java.lang.String lineStr) {
    if (currentLine > (n)) {
        return lineStr;
    }else {
        int x = 0;
        while (x < ((n) - currentLine)) {
            lineStr += ".";
            x++;
        } 
        int lineAmt = 0;
        while (lineAmt < currentLine) {
            lineStr += currentLine;
            lineAmt++;
        } 
        lineStr += "\n";
        return lineRecur((++currentLine), lineStr);
    }
}