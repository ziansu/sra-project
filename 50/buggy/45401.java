@java.lang.Override
public void dispose() {
    animator.stop();
    currentPainter.detach(canvas);
    currentPainter.dispose(canvas);
    super.dispose();
}