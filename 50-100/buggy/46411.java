public static int damage(int attackerAtt, int defenderDef) {
    double totalAttackPower = ((attackerAtt / defenderDef) + (new java.util.Random().nextDouble())) - 0.5;
    double result = (java.lang.Math.abs(totalAttackPower)) * attackerAtt;
    return ((int) (result));
}