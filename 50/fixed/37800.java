public void pause() {
    pauseMillis = (java.lang.System.nanoTime()) / 1000000;
    synchronized(com.badlogic.gdx.utils.Timer.instances) {
        app = null;
        com.badlogic.gdx.utils.Timer.wake();
    }
}