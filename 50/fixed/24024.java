@java.lang.Override
public int getHeight() {
    if (extended) {
        return ((super.getHeight()) + (panel.getHeight())) + 1;
    }else {
        return super.getHeight();
    }
}