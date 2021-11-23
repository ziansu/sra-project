protected void playSpellEffectsTrail(org.bukkit.Location loc1, org.bukkit.Location loc2) {
    if ((effects) != null) {
        java.util.List<com.nisovin.magicspells.spelleffects.SpellEffect> effectsList = effects.get(EffectPosition.TRAIL);
        if (effectsList != null) {
            for (com.nisovin.magicspells.spelleffects.SpellEffect effect : effectsList) {
                effect.playEffect(loc1, loc2);
            }
        }
    }
}