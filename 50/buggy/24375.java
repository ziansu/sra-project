public void update() {
    isPlayerAlive = (currentHealth) > 0;
    if (isGrounded) {
        numberOfJumpsLeft = com.sidescroller.Character.GameCharacter.DEFAULT_NUMBER_OF_JUMPS;
    }
    checkGroundSensor();
    runHandler();
    setGroundContactFriction();
}