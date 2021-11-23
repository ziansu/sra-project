@org.junit.Test
public void comparatorEqualsTest() {
    io.zipcoder.pets.PetComparator petComparator = new io.zipcoder.pets.PetComparator();
    io.zipcoder.pets.Pet ruby = new io.zipcoder.pets.Cat();
    io.zipcoder.pets.Pet dottie = new io.zipcoder.pets.Cat();
    int expected = 0;
    int actual = petComparator.compare(ruby, dottie);
    org.junit.Assert.assertEquals("same basic info", expected, actual);
}