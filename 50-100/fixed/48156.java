public void physics() {
    position = position.addWith(velocity);
    velocity = velocity.addWith(acceleration);
    mass = (width) * (height);
    if ((virtualWidth) > 0) {
        inputWidth = virtualWidth;
    }else {
        inputWidth = 0;
    }
    if ((virtualHeight) > 0) {
        inputHeight = virtualHeight;
    }else {
        inputHeight = 0;
    }
}