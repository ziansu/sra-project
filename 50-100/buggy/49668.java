public void checkCollisions(java.util.List<entity.Entity> entities) {
    game.Game game = game.Game.getInstance();
    int width = game.getScreenWidth();
    int height = game.getScreenHeight();
    collision.QuadTreeNode tree = new collision.QuadTreeNode(0, 0, width, height);
    tree.init();
    for (int i = 0; (entities.size()) > i; i++) {
        tree.insert(entities.get(i));
    }
    tree.check_collisions();
}