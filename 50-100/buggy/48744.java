private java.lang.String lineRecur(int currentLine) {
    if (currentLine == (n)) {
        return "";
    }else {
        java.lang.String lineStr = "";
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
        return lineStr + (lineRecur((currentLine++)));
    }
}