@java.lang.Override
public void run() {
    try {
        java.lang.System.out.println(sourceFloor);
        eleScene.inSemaphore.get(sourceFloor).acquire(1);
        eleScene.outSemaphore.get(destinationFloor).acquire(1);
        eleScene.personExitsAtFloor(destinationFloor);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}