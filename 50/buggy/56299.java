@java.lang.Override
public void interact(int interactionType, actors.Status status) {
    if (interactionType != (gameobjects.Interactive.INTERACTION_PICKUP)) {
        return ;
    }
    status.getInventory().addItem(this);
    onGround = false;
}