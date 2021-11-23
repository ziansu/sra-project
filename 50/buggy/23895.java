@java.lang.Override
public void take() {
    if (!(this.isTaken)) {
        this.getParent().getParent().getInventory().addItem(this);
        this.setTaken(true);
    }
}