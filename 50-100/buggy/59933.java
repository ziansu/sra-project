@org.junit.Test
public void EncapsulateManyToOne() {
    io.beanmapper.House house = createHouse();
    io.beanmapper.ResultManyToOne result = beanMapper.map(house, io.beanmapper.ResultManyToOne.class);
    org.junit.Assert.assertEquals("housename", result.getName());
    org.junit.Assert.assertEquals("denneweg", result.getStreet());
    org.junit.Assert.assertEquals(1, result.getNumber());
    org.junit.Assert.assertEquals("Nederland", result.getCountryName());
}