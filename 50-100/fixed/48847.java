@java.lang.Override
public java.util.Map<java.lang.Integer, com.asteria.game.character.combat.prayer.CombatPrayer> build() {
    java.util.Map<java.lang.Integer, com.asteria.game.character.combat.prayer.CombatPrayer> map = new java.util.HashMap<>();
    java.util.Arrays.stream(com.asteria.game.character.combat.prayer.CombatPrayer.values()).forEach(( it) -> map.put(it.id, it));
    return map;
}