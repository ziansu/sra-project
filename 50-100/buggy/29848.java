@java.lang.Override
public void run() {
    run = true;
    while (run) {
        killPlayer();
        try {
            java.lang.Thread.sleep(moveFrequency);
        } catch (java.lang.InterruptedException ex) {
            java.util.logging.Logger.getLogger(nz.ac.aut.ense701.gameModel.Enemy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        if ((pause) == false) {
            tracePlayer();
            game.EnemyMove();
        }
    } 
}