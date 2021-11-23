@org.junit.Test
public void EncapsulateManyToMany() {
    io.beanmapper.House house = createHouse();
    io.beanmapper.ResultManyToMany result = beanMapper.map(house, io.beanmapper.ResultManyToMany.class);
    org.junit.Assert.assertEquals("housename", result.getName());
    org.junit.Assert.assertEquals("denneweg", result.getAddressOfTheHouse().getStreet());
    org.junit.Assert.assertEquals(1, result.getAddressOfTheHouse().getNumber());
    org.junit.Assert.assertEquals("Nederland", result.getAddressOfTheHouse().getCountry().getCountryName());
}