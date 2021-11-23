@org.junit.Test
public void addRecipe3() {
    mocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    mocha.setName("Mocha");
    mocha.setPrice((-50));
    org.junit.Assert.assertFalse(coffeeMaker.addRecipe(coffee));
}