public void doBattle() {
    java.lang.System.out.println(((("Attack mounted from territory " + (attacker.getID())) + " to ") + (defender.getID())));
    while (((numAttackingArmies) != 0) && ((numDefendingArmies) != 0)) {
        doBattleOnce();
    } 
    if ((numAttackingArmies) == 1) {
        java.lang.System.out.println("Defender won");
        outcome = false;
    }else {
        java.lang.System.out.println("Attacker won");
        outcome = true;
    }
    resolve();
}