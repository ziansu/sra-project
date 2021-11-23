public static void copyaLine() {
    (demo.test.curLine)++;
    int preChar = demo.test.curChar;
    while (true) {
        char c = demo.test.source.charAt(demo.test.curChar);
        if (c == '\n') {
            (demo.test.curChar)++;
            break;
        }
        (demo.test.curChar)++;
    } 
    demo.test.outputBuffer += demo.test.source.substring(preChar, demo.test.curChar);
}