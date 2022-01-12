@org.junit.Test
public void comparatorCatDogTest() {
    io.zipcoder.pets.PetComparator petComparator = new io.zipcoder.pets.PetComparator();
    io.zipcoder.pets.Pet ruby = new io.zipcoder.pets.Cat();
    io.zipcoder.pets.Pet goldie = new io.zipcoder.pets.Dog();
    int expected = -1;
    int actual = petComparator.compare(ruby, goldie);
    org.junit.Assert.assertEquals(expected, actual);
}