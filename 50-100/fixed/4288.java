@java.lang.Override
public void draw() {
    switch (gameEngine.getSimulationState()) {
        case "startScreen" :
            {
                drawOuterWalls();
                drawStartScreen();
                break;
            }
        case "gameplay" :
            {
                drawOuterWalls();
                drawEntities();
                drawHUD();
                break;
            }
        case "menuScreen" :
            {
                drawOuterWalls();
                drawMenuScreen();
                break;
            }
        case "deathScreen" :
            {
                drawOuterWalls();
                drawEntities();
                drawDeathScreen();
                break;
            }
    }
}