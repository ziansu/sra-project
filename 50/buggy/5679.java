@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void leatherJacketTooLowTechLevelTest() {
    Equipment.Armor.LeatherJacket leatherJacket = new Equipment.Armor.LeatherJacket(0);
}