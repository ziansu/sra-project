public void update(com.dungeon.game.world.World world) {
    norm();
    calc(world);
    effect();
    move(world);
    phys(world);
    post(world);
    regen_stam();
    regen_mana();
    sight(world);
}