public void RunGame() {
    while (true) {
        gameStart();
        battleStart();
        while ((GameOn) == true) {
            battleActive();
            boolean a = battleEnd();
            if (a == true) {
                onPlayerWin();
            }
            if (a == false) {
                onPlayerLose();
                GameOn = false;
            }
        } 
    } 
}