public void moveEnemies() {
    for (com.patriciamarissa.game.Enemy e : enemies) {
        e.moveWithPlat();
        if (!(e.dying)) {
            e.move(holes);
        }else {
            e.animateDeath();
        }
    }
}