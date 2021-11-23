public indicator.DrumTab drawTabPage(int start, int end, int length) {
    startPosition = start;
    endPosition = end;
    pageLength = length;
    drawTab();
    java.lang.System.out.println("inserting 'defect'");
    return this;
}