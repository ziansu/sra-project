public void timerBomb(Core.Player.Player p) {
    timerDif = java.lang.System.currentTimeMillis();
    if (((timerDif) - (timerStart)) > (timerAmountBomb)) {
        explodeBomb(p);
        if (!(bombS.playing()))
            bombS.play();
        
    }
}