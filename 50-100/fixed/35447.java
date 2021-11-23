@java.lang.Override
public void run() {
    try {
        while ((hungryTime) >= 0) {
            java.lang.Thread.sleep(1000);
            setHungryTime(((hungryTime) - 1));
            setText(((("Hungry!" + " ") + (hungryTime)) + " sec"));
            HomeScreen.jenCode.checkRemoveDragon();
            if (game.miniGameTeam.GameScreen.isNotHome) {
                HomeScreen.jenCode.removeHungry(this);
            }
        } 
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}