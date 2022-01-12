public void addComponent(org.armory.d3.ui.components.ItemLabel i) {
    i.setEnableRightClick(false);
    i.setPreferredSize(new java.awt.Dimension(64, 128));
    if ((index) == 10) {
        c.gridy = (c.gridy) + 1;
        c.gridx = 0;
        index = 0;
    }
    c.gridx = (c.gridx) + 1;
    contentChest.add(i, c);
    (index)++;
}