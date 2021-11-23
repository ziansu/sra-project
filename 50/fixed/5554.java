private void updateMonster(model.Monster m) {
    if (m.isDead()) {
        removeSprite(m.getSpriteBase());
    }
    update(m.getSpriteBase());
}