@org.junit.Test
public void testHotelBuilder() {
    es.upm.miw.ecp1.Reservation reservation = new es.upm.miw.ecp1.Reservation();
    es.upm.miw.ecp1.Hotel hotel = new es.upm.miw.builder.HotelBuilder().id(1).name("Hotel A").category(Category.BASIC).reservation(reservation).build();
    org.junit.Assert.assertEquals(1, hotel.getId());
    org.junit.Assert.assertEquals("Hotel A", hotel.getName());
    org.junit.Assert.assertEquals(Category.BASIC, hotel.getCategory());
}