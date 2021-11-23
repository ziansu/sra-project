public void update(com.dungeon.game.world.World world) {
    norm();
    calc(world);
    move(world);
    effect();
    phys(world);
    post(world);
    regen_stam();
    regen_mana();
    sight(world);
}