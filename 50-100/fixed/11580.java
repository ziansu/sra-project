@org.junit.Test
public void editRecipe9() {
    coffeeMaker.addRecipe(coffee);
    edu.pjatk.inn.coffeemaker.impl.Recipe newMocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    newMocha.setName("Mocha");
    newMocha.setPrice(50);
    newMocha.setAmtCoffee("a");
    org.junit.Assert.assertFalse(coffeeMaker.editRecipe(coffee, newMocha));
}