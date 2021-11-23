@java.lang.Override
public void setBooleanMetadata(java.lang.String key, boolean value) {
    if (((sender.getBlock()) == null) || ((sender.getBlock().getType()) == (org.bukkit.Material.COMMAND))) {
        return ;
    }
    sender.getBlock().setMetadata(key, new org.bukkit.metadata.FixedMetadataValue(org.bitbucket.ucchy.undine.UndineMailer.getInstance(), value));
}