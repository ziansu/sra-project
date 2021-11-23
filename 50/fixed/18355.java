@org.junit.Test
public void addRecipe9() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice(60);
    mocha.setAmtCoffee("a");
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(mocha));
}