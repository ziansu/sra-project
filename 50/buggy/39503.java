protected void applyStatusEffect(int entityID, gg.al.logic.component.data.StatusEffect effect, java.lang.String effectName) {
    gg.al.logic.component.StatComponent statComponent = getComponent(entityID, gg.al.logic.component.StatComponent.class);
    statComponent.statusEffects.put(effectName, effect);
}