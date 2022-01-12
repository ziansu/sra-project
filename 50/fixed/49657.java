public boolean tankCanMove() {
    tankRevolution.model.Tank tank = characterList.get(characterTurn).getTank();
    return (tank.hasFuel()) && (!(isProjectileFlying()));
}