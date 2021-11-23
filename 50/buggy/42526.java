public void setCrossSection(int[][] crossSection, java.util.List<org.eclipse.swt.graphics.Point> upHint, java.util.List<org.eclipse.swt.graphics.Point> downHint) {
    this.crossSection = crossSection;
    this.upHint = upHint;
    this.downHint = downHint;
    redrawMe();
}