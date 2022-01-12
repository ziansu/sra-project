@org.junit.Test
public void editRecipe8() {
    coffeeMaker.addRecipe(coffee);
    edu.pjatk.inn.coffeemaker.impl.Recipe newMocha = new edu.pjatk.inn.coffeemaker.impl.Recipe();
    newMocha.setName("Mocha");
    newMocha.setPrice("a");
    org.junit.Assert.assertFalse(coffeeMaker.editRecipe(coffee, newMocha));
}