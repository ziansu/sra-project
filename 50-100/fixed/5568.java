@org.junit.Test
public void comparatorEqualsTest() {
    io.zipcoder.pets.PetComparator petComparator = new io.zipcoder.pets.PetComparator();
    io.zipcoder.pets.Pet ruby = new io.zipcoder.pets.Cat();
    io.zipcoder.pets.Pet dottie = new io.zipcoder.pets.Cat();
    int result = petComparator.compare(ruby, dottie);
    org.junit.Assert.assertTrue((result == 0));
}