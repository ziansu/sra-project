protected final void upgrade(net.minecraft.entity.player.EntityPlayerMP player) {
    int talent = net.ci010.attributesmod.handler.TalentHandler.getTalent(player).getInteger(this.id);
    setFromValue(player, this.affectByTalent(talent, player), false);
}