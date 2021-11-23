@java.lang.Override
public void collide(org.bukkit.block.Block block) {
    randomSpawnChicken(getLocation());
    remove();
}