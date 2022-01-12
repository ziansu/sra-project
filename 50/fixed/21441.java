@java.lang.Override
public void dispose() {
    soundManager.dispose();
    musicManager.dispose();
    renderer.dispose();
    isDone = true;
}