@java.lang.Override
public void run() {
    if ((view.radius) != (lastSize)) {
        view.radius = lastSize;
        view.invalidate();
    }
}