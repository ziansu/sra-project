public void setLane(kingofthehill.domain.Lane lane) {
    this.lane = lane;
    this.base = null;
    if ((lane.getBaseEnd1().getOwner()) == (this.getOwner())) {
        this.position = 0;
    }else {
        this.position = 100;
    }
}