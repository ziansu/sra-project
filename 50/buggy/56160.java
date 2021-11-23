public void leftclick(util.Vector2D clickPos) {
    java.lang.System.out.println(f.tileIndexAt(clickPos));
    java.lang.System.out.println(f.tileValueAt(clickPos));
    u.moveTo(clickPos);
}