@org.junit.Test
public void addInventory9() {
    org.junit.Assert.assertFalse(coffeeMaker.addInventory(5, 3, 7, java.lang.Integer.parseInt("a")));
}