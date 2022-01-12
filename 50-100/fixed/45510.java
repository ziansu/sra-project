@java.lang.Override
public void run() {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            updateCharacterView();
            updateBulletsView();
            updateEnemyView();
            updatePopupView();
        }
    });
    if (!(environment.isPaused())) {
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