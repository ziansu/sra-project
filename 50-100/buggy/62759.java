public void updateItemArray() {
    for (int x = 0; x < (super.getWidth()); x++) {
        for (int y = 0; y < (super.getHeigth()); y++) {
            super.setItemAt(x, y, items.get(switchid));
        }
    }
    super.getHandle().updateItemMap(this);
}