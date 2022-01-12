public boolean redo() {
    if (self.canRedo()) {
        self.getDrawingData().redo();
        self.nativeClear();
        self.nativeDrawData();
        if ((self.getDelegate()) != null) {
            self.getDelegate().didChangeDrawing(self, self.getDrawingData().canUndo(), self.getDrawingData().canRedo());
        }
        return true;
    }
    return false;
}