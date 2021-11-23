public void revive() {
    health = 100;
    previousHealth = 100;
    destroyed = false;
    setToDestroy = false;
    avoidObject = false;
    movementSpeed = 0.8F;
    maxSpeed = 1.0F;
    isFlipped = false;
    setBounds(0, 0, ((soldierWidth) / (com.coldpixel.sparkle.Main.PPM)), ((soldierHeight) / (com.coldpixel.sparkle.Main.PPM)));
    currentState = com.coldpixel.sparkle.sprites.Soldier.State.RIGHT;
    previousState = com.coldpixel.sparkle.sprites.Soldier.State.RIGHT;
}