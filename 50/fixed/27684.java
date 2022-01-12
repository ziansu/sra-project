public void changeStat(com.dd.Stats statChange) {
    addMaxHealth(statChange.getMaxHealth());
    addHealth(statChange.getHealth());
    addAttack(statChange.getAttack());
    addDefense(statChange.getDefense());
}