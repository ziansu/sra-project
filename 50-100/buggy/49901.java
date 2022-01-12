private static java.lang.Object activatePassiveAbility(dk.muj.derius.api.player.DPlayer dplayer, final dk.muj.derius.api.ability.Ability ability, java.lang.Object other) {
    org.apache.commons.lang.Validate.isTrue(((ability.getType()) == (dk.muj.derius.api.ability.Ability.AbilityType.PASSIVE)), "abilitytype must be passive");
    final java.lang.Object obj = ability.onActivate(dplayer, other);
    if (obj == (dk.muj.derius.api.util.AbilityUtil.CANCEL))
        return dk.muj.derius.api.util.AbilityUtil.CANCEL;
    
    ability.onDeactivate(dplayer, other);
    if (ability.hasCooldown()) {
        dplayer.setCooldownExpireInMillis(ability.getCooldownMillis());
    }
    return obj;
}