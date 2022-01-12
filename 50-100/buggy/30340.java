@java.lang.Override
public void performPress(java.awt.event.MouseEvent e) {
    startX = e.getX();
    startY = e.getY();
    hci.nickdaniel.draw.Drawable rec = new hci.nickdaniel.draw.MyRectangle(startX, startY, startX, startY);
    dp.addShape(rec);
    dp.setSelected(false);
}