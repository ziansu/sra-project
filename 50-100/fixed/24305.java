@java.lang.Override
public void detectAndSendChanges() {
    super.detectAndSendChanges();
    for (int i = 0; i < (listeners.size()); ++i) {
        updateContainer(listeners.get(i), false);
    }
    cookCost = infuser.cookCost;
    cookTime = infuser.cookTime;
}