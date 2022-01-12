@org.junit.Test
public void comparatorDiffTypesTest() {
    io.zipcoder.pets.PetComparator petComparator = new io.zipcoder.pets.PetComparator();
    io.zipcoder.pets.Pet ruby = new io.zipcoder.pets.Cat();
    io.zipcoder.pets.Pet otto = new io.zipcoder.pets.Goldfish();
    int result = petComparator.compare(otto, ruby);
    org.junit.Assert.assertTrue((result > 0));
}