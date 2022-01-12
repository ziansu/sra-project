public void setPizzaPowerup(boolean pickedUp) {
    hasPizzaPowerup = pickedUp;
    if (pickedUp) {
        timeLeftPizzaPowerup = com.packtpub.libgdx.canyonbunny.util.Constants.ITEM_PIZZA_POWERUP_DURTION;
        this.terminalVelocity.set(((originalTerminal.x) * 2), ((originalTerminal.y) * 2));
    }else {
        this.acceleration.set(originalTerminal.x, originalTerminal.y);
    }
}