@java.lang.Override
public void reinitWindow() {
    if (org.gephi.ui.utils.UIUtils.isAquaLookAndFeel()) {
        java.awt.Container c = graphComponent.getParent();
        if (c != null) {
            c.remove(graphComponent);
            c.add(graphComponent, java.awt.BorderLayout.CENTER);
        }
    }
}