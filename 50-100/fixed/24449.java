@java.lang.Override
public void set(java.lang.String arg) {
    if (has(arg)) {
        tag.set(player.getName(), arg);
        tag.save();
        player.setDisplayName((((arg + " ") + (player.getDisplayName())) + (cn.nukkit.utils.TextFormat.WHITE)));
        player.setNameTag(player.getDisplayName());
    }
}