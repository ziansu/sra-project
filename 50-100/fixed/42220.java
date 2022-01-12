public void move() {
    if (((this.path.getPathPoints().size()) - (speed)) > (this.counter)) {
        this.counter += speed;
        this.updateCarCoordinates();
        int change = this.needChange();
        if (change > (-1)) {
            laneChoise = change;
        }
        this.updateLaneChoise();
    }else {
        this.pathEnd = 1;
    }
}