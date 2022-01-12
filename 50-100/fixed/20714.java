public static zenixmc.user.ZenixUserInterface[] members(java.lang.String name) {
    for (zenixmc.user.ZenixUserInterface z : zenixmc.organization.Clan.playerClan.keySet()) {
        if ((zenixmc.organization.Clan.playerClan.get(z)) == name) {
            return new zenixmc.user.ZenixUserInterface[]{ z };
        }
    }
    return null;
}