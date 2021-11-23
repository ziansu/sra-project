@java.lang.Override
public void unSubscribe() {
    if ((animation) != null) {
        if (animation.isStarted()) {
            animation.end();
        }
    }
}