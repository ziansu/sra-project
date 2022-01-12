public boolean addConnectedChip(player.ConnectedChip chip) {
    if (((java.lang.Math.abs(((chip.x) - (this.x)))) <= 1) && ((java.lang.Math.abs(((chip.y) - (this.y)))) <= 1)) {
        if ((this.neighbourChip) != null) {
            return false;
        }
        this.neighbourChip = chip;
    }
    this.connectedChips.add(chip);
    return true;
}