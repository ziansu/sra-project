@java.lang.Override
public void handleResize() {
    this.displayText.setPrefWidth(this.getWidth());
    this.displayText.setPrefHeight(this.getHeight());
    if (this.textHasSize()) {
        while (this.isTextUndersized()) {
            this.incrementFontSize(io.github.zachohara.percussionpacker.common.ShrinkableLabel.FONT_SIZE_INCREMENT);
        } 
        while (this.isTextOversized()) {
            this.incrementFontSize((-(io.github.zachohara.percussionpacker.common.ShrinkableLabel.FONT_SIZE_INCREMENT)));
        } 
    }
}