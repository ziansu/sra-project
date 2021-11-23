@java.lang.Override
public void run() {
    p1PW.println(hero1.getName());
    p2PW.println(hero2.getName());
    p1PW.println(hero2.getName());
    p2PW.println(hero1.getName());
    boolean gameIsRunning = true;
    while (gameIsRunning) {
        if (!(hpCheck()))
            gameIsRunning = false;
        
    } 
    endGame();
    java.lang.System.out.println("End of the game");
}