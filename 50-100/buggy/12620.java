java.lang.String executeChange(org.bukkit.entity.Player player, java.lang.String oldGroup, java.lang.String newGroup, java.lang.String world) {
    java.lang.String msg;
    if (changeGroup(player, oldGroup, newGroup, world)) {
        msg = (((("Successfully changed " + player) + " to group ") + newGroup) + " in world ") + world;
    }else {
        msg = (((("Unsuccessfully changed " + player) + " to group ") + newGroup) + " in world ") + world;
    }
    return msg;
}