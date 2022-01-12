@java.lang.Override
public void run() {
    view = getScope().getGui().showView(getViewId(), (isUnique() ? null : getName()), 3);
    if ((view) == null) {
        return ;
    }
    view.addOutput(this);
}