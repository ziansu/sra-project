@org.junit.Test
public void EncapsulateOneToMany() {
    io.beanmapper.Country country = new io.beanmapper.Country("Nederland");
    io.beanmapper.ResultOneToMany result = beanMapper.map(country, io.beanmapper.ResultOneToMany.class);
    assertEquals("Nederland", result.getResultCountry().getCountryName());
}