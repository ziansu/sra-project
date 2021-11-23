private void handleSuperPowers() {
    if (((botsKilled) == 1) && (!(showSuperPowers))) {
        showSuperPowers = true;
        superPowerTimer = 600;
        oldDamage = damage;
        damage = 100;
        ++(botsKilled);
        java.lang.System.out.println(("Damage " + (damage)));
    }
    if (showSuperPowers)
        --(superPowerTimer);
    
    if (((superPowerTimer) == 0) && (showSuperPowers)) {
        damage = oldDamage;
        showSuperPowers = false;
    }
}