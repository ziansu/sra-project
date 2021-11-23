@java.lang.Override
public void run() {
    try {
        eleScene.inSemaphore.get(1).acquire();
        eleScene.outSemaphore.get(1).acquire();
        eleScene.personExitsAtFloor(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}