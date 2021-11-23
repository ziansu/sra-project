@java.lang.Override
public boolean condition() throws java.lang.InterruptedException {
    return (!(myPlayer().isMoving())) && (!(myPlayer().isAnimating()));
}