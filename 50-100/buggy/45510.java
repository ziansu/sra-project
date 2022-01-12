@java.lang.Override
public void run() {
    if (!(environment.isPaused())) {
        runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                updateCharacterView();
                updateBulletsView();
                updateEnemyView();
                updatePopupView();
            }
        });
        if (com.test.platformerse1.C_EnvironmentController.update()) {
            runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    displayEndscreen();
                }
            });
        }
    }
}