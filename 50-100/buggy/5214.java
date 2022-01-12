public void addItem(com.terrain.block.BlockType block) {
    com.blockhalde.gui.Item item = null;
    for (com.blockhalde.gui.Item itemtype : this.itemtypes) {
        if ((itemtype.id) == (block.getBlockId())) {
            item = itemtype;
        }
    }
    if (item != null) {
        this.items.add(item);
    }
    if ((lst) != null) {
        lst.itemAdded(this.items);
    }
}