@java.lang.Override
public void unSubscribe() {
    if (((animation) != null) && (animation.isStarted())) {
        animation.end();
    }
}