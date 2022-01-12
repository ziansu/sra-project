void setSpeed(boolean isRaining) {
    speed = 100;
    if (isRaining) {
        speed -= hu.po.Main.getRandom(5, 50);
    }
}