@org.junit.Test
public void addRecipe10() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice(60);
    mocha.setAmtCoffee(3);
    mocha.setAmtMilk(java.lang.Integer.parseInt("a"));
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(coffee));
}