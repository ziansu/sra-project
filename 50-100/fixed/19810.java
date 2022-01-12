public void playTrackingLinePatterns(com.nisovin.magicspells.spelleffects.EffectPosition pos, org.bukkit.Location origin, org.bukkit.Location target, org.bukkit.entity.Entity originEntity, org.bukkit.entity.Entity targetEntity) {
    if ((effects) != null) {
        java.util.List<com.nisovin.magicspells.spelleffects.SpellEffect> spellEffects = effects.get(pos);
        if (spellEffects != null) {
            for (com.nisovin.magicspells.spelleffects.SpellEffect e : spellEffects) {
                e.playTrackingLinePatterns(origin, target, originEntity, targetEntity);
            }
        }
    }
}