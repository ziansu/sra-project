private void drawGhosts() {
    for (int i = 0; i < 4; i++) {
        this.drawScaled(batch, currentGhostFrame[i], ghostList.get(i).getCurrentX(), ghostList.get(i).getCurrentY());
    }
}