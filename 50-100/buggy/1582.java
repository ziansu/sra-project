private void printText(java.lang.String text) {
    if ((text.length()) > (Output.ConsoleOutput.lineLenght)) {
        java.lang.String[] lines = getMultipleLines(text);
        for (int i = 0; i < (lines.length); i++) {
            java.lang.System.out.println(lines[i]);
        }
    }
}