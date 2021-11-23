@org.junit.Test
public void addRecipe11() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice(60);
    mocha.setAmtCoffee(3);
    mocha.setAmtMilk(2);
    mocha.setAmtSugar(java.lang.Integer.parseInt("a"));
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(coffee));
}