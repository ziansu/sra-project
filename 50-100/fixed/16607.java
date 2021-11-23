public void hideAll() {
    for (int i = 0; i < (this.getWidth()); i++) {
        for (int j = 0; j < (this.getHeight()); j++) {
            this.getGrid()[i][j].resetFlag();
            this.getGrid()[i][j].resetClick();
            this.getGrid()[i][j].notifyCase();
        }
    }
}