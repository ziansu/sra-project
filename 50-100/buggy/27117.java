@java.lang.Override
public void run() {
    if (running) {
        if (!(environment.update(Environment.player))) {
            runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    updateCharacterView();
                    updateBulletsView();
                    updateEnemyView();
                }
            });
        }else {
            runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    displayEndscreen();
                }
            });
        }
    }
}