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
        world.retry();
        menu.endScreen();
        menu.interact();
    }
}