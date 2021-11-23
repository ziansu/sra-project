public void purchaseMultiple(int index, int quantity, ver0.PlayerActor character) {
    ver0.Item[] itemSet = ver0.Item.getAllItems();
    if (character.canBuyItems(index, quantity)) {
        if (character.buyItems(index, quantity)) {
            java.lang.System.out.println(((("Purchase successful! You have bought" + quantity) + " ") + (itemSet[index])));
            this.m_inventory[index] -= quantity;
        }
        this.m_inventory[index] -= quantity;
    }else {
        java.lang.System.out.println("Sorry, you don't have enough money!");
    }
}