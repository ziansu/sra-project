@java.lang.Override
public boolean update() {
    super.update();
    updateSelected(false);
    if ((selectedBindingValueChangeListener) != null) {
        selectedBindingValueChangeListener.refreshObserving();
    }
    return true;
}