public void update() {
    super.update();
    if ((myType) != (abyssproductions.double0driver.GameObjects.Enemy.EnemyType.Helicopter)) {
        moveVertical(myVelocity.y);
    }else {
        moveHorizontal(myVelocity.x);
        moveVertical(myVelocity.y);
    }
}