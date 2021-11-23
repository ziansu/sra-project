@java.lang.Override
public int getHeight() {
    if (extended) {
        return (super.getHeight()) + (panel.getHeight());
    }else {
        return super.getHeight();
    }
}