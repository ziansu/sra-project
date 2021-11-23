@java.lang.Override
public void handleResize() {
    if (this.textHasSize()) {
        while ((this.isTextOversized()) && ((this.getFontSize()) > (io.github.zachohara.percussionpacker.graphic.ShrinkableLabel.MIN_FONT_SIZE))) {
            this.incrementFontSize((-(io.github.zachohara.percussionpacker.graphic.ShrinkableLabel.FONT_SIZE_INCREMENT)));
        } 
        while (this.isTextUndersized()) {
            this.incrementFontSize(io.github.zachohara.percussionpacker.graphic.ShrinkableLabel.FONT_SIZE_INCREMENT);
        } 
    }
}