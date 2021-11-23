@java.lang.Override
public void interact() {
    if (!(getClicked())) {
        super.interact();
        this.getSelf().setFill(color);
    }
}