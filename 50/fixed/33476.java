public void activate() {
    if (!(active)) {
        this.active = true;
        this.timer = nl.tudelft.contextproject.model.entities.Bomb.TIMER;
    }
}