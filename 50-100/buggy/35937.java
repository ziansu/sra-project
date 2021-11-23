public void update(character.Player player) {
    for (int i = (gegner.size()) - 1; i >= 0; i++) {
        character.Enemy g = gegner.get(i);
        g.move(player.getPosition());
        if (!(g.update())) {
            g.dropItems();
            gegner.remove(g);
        }
    }
}