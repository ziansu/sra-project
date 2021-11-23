public int calculateDefenceAgainstMissilesSkill() {
    int defence = calculateDefenceSkill();
    defence = modifyValue(AbilityCommand.MODIFY_MISSILE_DEFENCE, defence);
    if (com.dbash.models.Creature.LOG)
        com.dbash.util.L.log("missile defence: %s", defence);
    
    return defence;
}