@org.junit.Test
public void testGetReservedSeats() {
    for (int i = 0; i < (r.getReserved_seats().length); i++)
        org.junit.Assert.assertEquals(seats[i], r.getReserved_seats()[i]);
    
}