@java.lang.Override
public void vicinityDisjunctionNotice(com.esbjon.entities.MovingEntity disjunctEntity) {
    if (eligibleEntities.contains(disjunctEntity, false)) {
        if ((disjunctEntity == (targetEntity)) && ((state) == (com.esbjon.entities.SteeringEntity.behaviorState.CHASE)))
            this.cancelChase();
        
        eligibleEntities.removeValue(disjunctEntity, false);
    }
}