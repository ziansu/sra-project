@java.lang.Override
public void setStringMetadata(java.lang.String key, java.lang.String value) {
    if ((((sender) == null) || ((sender.getBlock()) == null)) || ((sender.getBlock().getType()) == (org.bukkit.Material.COMMAND))) {
        return ;
    }
    sender.getBlock().setMetadata(key, new org.bukkit.metadata.FixedMetadataValue(org.bitbucket.ucchy.undine.UndineMailer.getInstance(), value));
}