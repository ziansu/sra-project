protected int getPaddedSize() {
    int scrollHeight = (this.height) - 96;
    int minSlots = ((int) (java.lang.Math.ceil((scrollHeight / (wafflestomper.ghostwriter.GuiFileSelection.ScrollList.SLOT_HEIGHT)))));
    if ((this.listItems.size()) >= minSlots) {
        return (this.listItems.size()) + 1;
    }else {
        return minSlots;
    }
}