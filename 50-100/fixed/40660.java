@java.lang.Override
public void update(double time) {
    if (inventoryContains("Hatchet")) {
        if (inventoryContains("Water")) {
            removeFromInventory("Water");
            worldState.updatePlayersItems();
        }
    }
    if (inventoryContains("Water")) {
        if (inventoryContains("Coupon")) {
            removeFromInventory("Coupon");
            worldState.updatePlayersItems();
        }
    }
    if (inventoryContains("Coin")) {
        if ((getQuantity("Coin")) <= 0) {
            removeFromInventory("Coin");
            worldState.updatePlayersItems();
        }
    }
}