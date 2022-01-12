@java.lang.Override
public int attacked(battle.Attack attack) {
    if (((attack.hitRoll()) >= (_ac)) && ((attack.hitRoll()) > 0)) {
        int damage = attack.damageRoll();
        _hp = (_hp) - damage;
        displayHit(damage);
        return damage;
    }else {
        displayMiss();
    }
    return 0;
}