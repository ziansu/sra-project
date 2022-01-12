public void mouseClicked(java.awt.event.MouseEvent e) {
    model.Location tileLocation = this.getTileLocation(e);
    model.TakeableItem droppedItem = ((model.TakeableItem) (board.getMap().getTile(tileLocation).getItem()));
    java.lang.System.out.println(((droppedItem + "  ") + tileLocation));
    if (board.getAvatar().getInventory().findAndEquip(droppedItem)) {
        board.getMap().getTile(tileLocation).dropItem();
    }
}