@com.codeclan.cs.Test
public void farmerBuyAnimal() {
    com.codeclan.cs.FarmAnimals animal1 = new com.codeclan.cs.Cows("highland", 500);
    com.codeclan.cs.Farmer farmer1 = new com.codeclan.cs.Farmer();
    farmer1.buy(animal1);
    assertEquals(animal1, farmer1.animalStock.get(0));
}