@org.junit.Test
public void EncapsulateManyToMany() {
    io.beanmapper.House house = createHouse();
    io.beanmapper.ResultManyToMany result = beanMapper.map(house, io.beanmapper.ResultManyToMany.class);
    assertEquals("housename", result.getName());
    assertEquals("denneweg", result.getAddressOfTheHouse().getStreet());
    assertEquals(1, result.getAddressOfTheHouse().getNumber());
    assertEquals("Nederland", result.getAddressOfTheHouse().getCountry().getCountryName());
}