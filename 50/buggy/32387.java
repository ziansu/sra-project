@java.lang.Override
public void run() {
    java.lang.System.out.println("NetworkLayer: initial update requested");
    running = true;
    synchronized(NetworkLayer.targetUpdateDate) {
        initialUpdate();
        sliceUpdate();
    }
}