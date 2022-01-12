@org.junit.Test
public void editRecipe2() {
    coffeeMaker.addRecipe(coffee);
    edu.pjatk.inn.coffeemaker.impl.Recipe newCoffee = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    newCoffee.setName("Coffee");
    newCoffee.setPrice(50);
    newCoffee.setAmtCoffee(3);
    newCoffee.setAmtMilk(1);
    newCoffee.setAmtSugar(1);
    newCoffee.setAmtChocolate(0);
    org.junit.Assert.assertTrue(coffeeMaker.editRecipe(coffee, newCoffee));
    org.junit.Assert.assertFalse(coffeeMaker.editRecipe(newCoffee, newCoffee));
}