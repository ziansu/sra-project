public void playTrackingLinePatterns(com.nisovin.magicspells.spelleffects.EffectPosition pos, org.bukkit.Location origin, org.bukkit.Location target, org.bukkit.entity.Entity originEntity, org.bukkit.entity.Entity targetEntity) {
    java.util.List<com.nisovin.magicspells.spelleffects.SpellEffect> spellEffects = effects.get(pos);
    for (com.nisovin.magicspells.spelleffects.SpellEffect e : spellEffects) {
        e.playTrackingLinePatterns(origin, target, originEntity, targetEntity);
    }
}