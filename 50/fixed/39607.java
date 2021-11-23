protected void applyDamage(int entity, gg.al.logic.component.data.Damage damage) {
    gg.al.logic.component.StatComponent statComponent = getComponent(entity, gg.al.logic.component.StatComponent.class);
    if (statComponent != null)
        statComponent.damages.add(damage);
    
}