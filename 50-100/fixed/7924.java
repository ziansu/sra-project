private void endTable() throws java.io.IOException {
    if (drawLines) {
        drawLine("Row Bottom Border ", this.margin, this.yStart, (((this.margin) + (width)) + (be.quodlibet.boxable.Table.xSpacing)), this.yStart);
    }
    this.tableContentStream.close();
}