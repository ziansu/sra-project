@java.lang.Override
public void blockUpdate(org.bukkit.Location location) {
    if (doesHandle(location.getBlock().getType()))
        queueBlock(location);
    
}