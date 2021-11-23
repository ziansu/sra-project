@java.lang.Override
public void dispose() {
    if (!(loader.isDisposed())) {
        loader.dispose();
        drawer.dispose();
        data = null;
    }
}