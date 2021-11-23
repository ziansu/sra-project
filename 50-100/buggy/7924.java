private void endTable() throws java.io.IOException {
    be.quodlibet.boxable.Table.LOGGER.info("Ending Table");
    if (drawLines) {
        drawLine("Row Bottom Border ", this.margin, this.yStart, (((this.margin) + (width)) + (be.quodlibet.boxable.Table.xSpacing)), this.yStart);
    }
    this.tableContentStream.close();
}