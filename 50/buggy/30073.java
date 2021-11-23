@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void scaleArmorTooHighTechLevelTest() {
    Equipment.Armor.ScaleArmor scaleArmor = new Equipment.Armor.ScaleArmor(5);
}