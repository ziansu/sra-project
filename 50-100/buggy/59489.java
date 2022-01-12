public void draw() {
    background(0);
    if ((!(playGame)) && ((endGame) == false)) {
        menu.display();
        menu.interact();
    }
    if (playGame) {
        play();
    }
    if ((endGame) && ((playGame) == false)) {
        world = new me.itsdavidhunt.World(this);
        world.retry();
        menu.endScreen();
        menu.interact();
    }
}