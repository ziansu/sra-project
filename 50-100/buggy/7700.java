public boolean undo() {
    if (self.canUndo()) {
        self.getDrawingData().undo();
        self.nativeClear();
        self.nativeDrawData();
        if ((self.getDelegate()) != null) {
            self.getDelegate().didChangeDrawing(self, self.canUndo(), self.canRedo());
        }
        return true;
    }
    return false;
}