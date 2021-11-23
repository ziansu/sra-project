public void mouseClicked(java.awt.event.MouseEvent e) {
    boolean temp = false;
    if ((e.getClickCount()) >= 2) {
        item.Item item = control.creatItem("ī�G");
        temp = control.checkBag(item.price());
        if (temp) {
            control.setBagItem(item);
        }
    }
}