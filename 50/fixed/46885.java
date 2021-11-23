private boolean isDead(com.mygdx.model.unit.Unit defendUnit) {
    return (defendUnit.getStatus().getHp()) <= 1;
}