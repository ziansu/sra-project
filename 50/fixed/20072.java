private void calcRelativePos(Player player) {
    relativePos = new org.jbox2d.common.Vec2(player.getSize().x, ((-(size.y)) / 2));
}