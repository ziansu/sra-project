@java.lang.Override
public void update() {
    super.update();
    if (hasWorldObj()) {
        if ((soundDelay) > 0) {
            --(soundDelay);
        }
    }
}