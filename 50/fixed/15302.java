@java.lang.Override
public void setEnabled(boolean b) {
    super.setEnabled(b);
    java.awt.Component[] children = this.getComponents();
    for (java.awt.Component child : children) {
        child.setEnabled(b);
    }
}