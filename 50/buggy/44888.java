@java.lang.Override
public boolean update() {
    super.update();
    updateSelected();
    if ((selectedBindingValueChangeListener) != null) {
        selectedBindingValueChangeListener.refreshObserving();
    }
    return true;
}