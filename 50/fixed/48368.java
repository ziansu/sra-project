@java.lang.Override
public void onDeath(dev.game.spacechaos.engine.entity.Entity causingEntity) {
    if (causingEntity == null)
        return ;
    
    dev.game.spacechaos.game.entities.component.combat.ScoreComponent scoreComp = causingEntity.getComponent(dev.game.spacechaos.game.entities.component.combat.ScoreComponent.class);
    if (scoreComp != null) {
        scoreComp.addScore(score);
    }
}