public void doStep() {
    if ((this.resourceTimer) > 600) {
        giveResources();
        this.resourceTimer = 0;
    }
    operateUnits();
    for (kingofthehill.domain.IPlayer player : players) {
        if (player instanceof kingofthehill.domain.AI) {
        }
    }
    (this.resourceTimer)++;
}