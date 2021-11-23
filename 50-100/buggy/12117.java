@java.lang.Override
public void run() {
    if (((animator) != null) && (animator.isStarted())) {
        animator.stop();
    }
    if ((renderer) != null) {
        renderer.dispose(window);
    }
    canvas.dispose();
    window = null;
    renderer = null;
    view = null;
    animator = null;
}