public boolean equipItem(dev.ipsych0.mygame.items.Item item) {
    if ((this.itemStack) != null) {
        if ((item.equipSlot) == (itemStack.getItem().equipSlot)) {
            return false;
        }else {
            return true;
        }
    }else {
        this.itemStack = new dev.ipsych0.mygame.items.ItemStack(item);
        return true;
    }
}