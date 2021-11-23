private void handleBackspace() {
    if ((this.strokecount) > 1) {
        this.strokecount -= 1;
        updateCandidates();
    }else
        if ((this.strokecount) > 0) {
            this.stroktreset();
            this.setCandidatesViewShown(false);
        }else {
            this.setCandidatesViewShown(false);
            keyDownUp(KeyEvent.KEYCODE_DEL);
        }
    
}