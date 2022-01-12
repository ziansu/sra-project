@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void calculateBasicSwingingWeaponDamageZeroOrNegativeStrengthTest() {
    Equipment.Weapon.calculateBasicWeaponDamage(0, Equipment.Weapon.AttackType.SWINGING);
}