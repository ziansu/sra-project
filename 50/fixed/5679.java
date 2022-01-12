@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void leatherJacketTooLowTechLevelTest() {
    new Equipment.Armor.LeatherJacket(0);
}