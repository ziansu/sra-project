@java.lang.Override
public void run() {
    (count)++;
    if (!(com.example.leon.taitou.MainActivity.alert)) {
        cameraView.captureImage();
    }
    if (((count) % 6) == 0) {
        if ((com.example.leon.taitou.MainActivity.historyAlert) == 5) {
            mPlayer.start();
            com.example.leon.taitou.MainActivity.alert = true;
        }
        com.example.leon.taitou.MainActivity.historyAlert = 0;
    }
    if ((((count) % 30) == 0) & (com.example.leon.taitou.MainActivity.alert)) {
        com.example.leon.taitou.MainActivity.alert = false;
    }
}