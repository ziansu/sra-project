@java.lang.Override
public void run() {
    if ((view.radius) != (lastSize)) {
        view.radius = view.convertDpToPixel(lastSize);
        view.invalidate();
    }
}