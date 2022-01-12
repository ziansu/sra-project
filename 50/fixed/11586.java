public void display2ndLine(java.lang.String line) {
    final java.lang.String lineFixed = fixLineValue(line);
    if (!(this.previousLine2.equals(lineFixed))) {
        displayLine(1, lineFixed, false);
        this.previousLine2 = lineFixed;
    }
}