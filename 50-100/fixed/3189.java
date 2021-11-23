@org.junit.Test
public void editRecipe12() {
    coffeeMaker.addRecipe(coffee);
    edu.pjatk.inn.coffeemaker.impl.Recipe newMocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    newMocha.setName("Mocha");
    newMocha.setPrice(50);
    newMocha.setAmtCoffee(3);
    newMocha.setAmtMilk(2);
    newMocha.setAmtSugar(2);
    newMocha.setAmtChocolate("a");
    org.junit.Assert.assertFalse(coffeeMaker.editRecipe(coffee, newMocha));
}