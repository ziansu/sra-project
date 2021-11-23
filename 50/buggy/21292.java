public void act(boolean enemy) {
    if (isOffScreen()) {
        if (enemy) {
            setX(FoodFight.FOOD_DOCK);
        }else {
            respawn();
        }
    }else {
        move();
    }
}