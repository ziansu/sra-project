@org.junit.Test
public void testConstructorValidFunding() {
    {
        new edu.luc.cs.cs271.lab2.Team("USA", "Klinsmann", 0);
        fail("should have thrown IllegalArgumentException");
    }
}