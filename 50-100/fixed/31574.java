@java.lang.Override
public void run() {
    if (!(liveViewTurnedOn)) {
        try {
            java.lang.Thread.sleep(1500);
            liveViewTurnedOn = updateLiveView();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
    while (liveViewTurnedOn) {
        liveViewTurnedOn = updateLiveView();
    } 
    getTakenPicture();
}