@java.lang.Override
public void onEnter(dev.game.spacechaos.engine.entity.Entity entity, dev.game.spacechaos.engine.entity.Entity otherEntity) {
    if (otherEntity == (ownerEntity)) {
        return ;
    }
    dev.game.spacechaos.game.entities.component.combat.HPComponent hpComponent = otherEntity.getComponent(dev.game.spacechaos.game.entities.component.combat.HPComponent.class);
    if (hpComponent == null) {
        return ;
    }
    hpComponent.subHP(this.reduceHP, entity);
}