@java.lang.Override
public void dispose() {
    super.dispose();
    source.removeListEventListener(this);
}