@java.lang.Override
public void setEnabled(boolean b) {
    this.setEnabled(b);
    java.awt.Component[] children = this.getComponents();
    for (java.awt.Component child : children) {
        child.setEnabled(b);
    }
}