@org.junit.Test
public void EncapsulateManyToOne() {
    io.beanmapper.House house = createHouse();
    io.beanmapper.ResultManyToOne result = beanMapper.map(house, io.beanmapper.ResultManyToOne.class);
    assertEquals("housename", result.getName());
    assertEquals("denneweg", result.getStreet());
    assertEquals(1, result.getNumber());
    assertEquals("Nederland", result.getCountryName());
}