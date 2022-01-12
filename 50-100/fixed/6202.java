@java.lang.Override
public boolean addPlayer(com.feed_the_beast.ftbl.api.IForgePlayer player) {
    if (hasStatus(player, EnumTeamStatus.INVITED)) {
        player.setTeamID(getName());
        if (!(hasStatus(player, EnumTeamStatus.MEMBER))) {
            MinecraftForge.EVENT_BUS.post(new com.feed_the_beast.ftbl.api.events.team.ForgeTeamPlayerJoinedEvent(this, player));
            setStatus(player.getId(), EnumTeamStatus.MEMBER);
        }
        return true;
    }
    return false;
}