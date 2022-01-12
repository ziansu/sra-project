@java.lang.Override
public void collide(org.bukkit.block.Block block) {
    randomSpawnChicken(getLocation().add(0, 1, 0));
    remove();
}