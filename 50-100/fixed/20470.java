@org.junit.Test
public void editRecipe10() {
    coffeeMaker.addRecipe(coffee);
    edu.pjatk.inn.coffeemaker.impl.Recipe newMocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    newMocha.setName("Mocha");
    newMocha.setPrice(50);
    newMocha.setAmtCoffee(3);
    newMocha.setAmtMilk("a");
    org.junit.Assert.assertFalse(coffeeMaker.editRecipe(coffee, newMocha));
}