public void adjustPower(Player.Ground ground) {
    if (((this.vSpeed) < (-35)) || (!(this.overFlatGround(ground)))) {
        this.power = 4;
    }else {
        this.power = 0;
    }
    this.print(ground);
}