public void carry(game.Carryable carrything) {
    if ((carrything.carryCap) > (carrything.carriedBy.size())) {
        sketch.audio.localSound(1, this);
        carrything.carriedBy.add(this);
        carrying = carrything;
        carryX = (x) - (carrything.x);
        carryY = (y) - (carrything.y);
        unfollow();
    }
}