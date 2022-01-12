private void apply(com.zconami.Caravans.domain.LinkedEntityCreateParameters<BE, ME> params) {
    this.bukkitEntity = params.getBukkitEntity();
    final ME pMinecraftEntity = params.getMinecraftEntity();
    this.minecraftEntity = (pMinecraftEntity == null) ? ((ME) (com.zconami.Caravans.util.NMSUtils.getMinecraftEntity(bukkitEntity))) : pMinecraftEntity;
}