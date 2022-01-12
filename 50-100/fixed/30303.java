@com.codeclan.cs.Test(expected = com.codeclan.cs.AnimalNotFoundException.class)
public void testhasBoughtUnsuccessful() throws com.codeclan.cs.AnimalNotFoundException {
    com.codeclan.cs.FarmAnimals animal2 = new com.codeclan.cs.Cows();
    com.codeclan.cs.Farmer farmer = new com.codeclan.cs.Farmer();
    try {
        farmer.buy(animal2);
        fail("Exception wasn't thrown");
    } catch (com.codeclan.cs.AnimalNotFoundException e) {
        java.lang.System.err.println(e.getMessage());
        throw new com.codeclan.cs.AnimalNotFoundException(animal);
    }
}