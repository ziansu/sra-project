public void act() {
    int x = Greenfoot.getRandomNumber(getWidth());
    int y = Greenfoot.getRandomNumber(getHeight());
    Zombie zom = new Zombie();
    if ((x <= 2) || (y <= 2)) {
        addObject(zom, x, y);
    }
    zom.turnTowards(400, 300);
}