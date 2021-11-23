@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void scaleArmorTooLowTechLevelTest() {
    new Equipment.Armor.ScaleArmor(1);
}