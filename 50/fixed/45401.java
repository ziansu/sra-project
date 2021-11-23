@java.lang.Override
public void dispose() {
    if ((canvas) != null) {
        animator.stop();
        currentPainter.detach(canvas);
    }
    super.dispose();
}