public int canSee(final illarion.client.world.Char chara) {
    if (isPlayer(chara.getCharId())) {
        return Char.VISIBILITY_MAX;
    }
    int visibility = Char.VISIBILITY_MAX;
    final illarion.client.graphics.Avatar avatar = chara.getAvatar();
    if (avatar != null) {
        visibility = avatar.getVisibility();
    }
    visibility += chara.getVisibilityBonus();
    return getVisibility(chara.getLocation(), visibility);
}