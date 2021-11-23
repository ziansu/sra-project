@java.lang.Override
public void onChanged() {
    if (isVisible()) {
        this.setEmptyShown(isEmpty());
    }
}