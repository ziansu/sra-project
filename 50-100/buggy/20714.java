public static java.util.List<zenixmc.user.ZenixUserInterface> members(java.lang.String name) {
    java.util.List<zenixmc.user.ZenixUserInterface> l = new java.util.ArrayList<>();
    for (zenixmc.user.ZenixUserInterface z : zenixmc.organization.Clan.playerClan.keySet()) {
        if ((zenixmc.organization.Clan.playerClan.get(z)) == name) {
            l.add(z);
            return l;
        }
    }
    return null;
}