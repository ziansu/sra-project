public static void restart() {
    io.anuke.duel.Duel.enemy.y = 200;
    io.anuke.duel.Duel.enemy.x = io.anuke.duel.Duel.player.x = 0;
    io.anuke.duel.Duel.player.y = -200;
    io.anuke.duel.Duel.enemy.health = ((int) ((io.anuke.duel.Duel.health) * 1.5F));
    io.anuke.duel.Duel.player.health = io.anuke.duel.Duel.health;
    io.anuke.ucore.entities.EntityHandler.instance().entities.clear();
    io.anuke.ucore.entities.EntityHandler.instance().entitiesToAdd.clear();
    io.anuke.duel.Duel.player.add();
    io.anuke.duel.Duel.enemy.add();
}