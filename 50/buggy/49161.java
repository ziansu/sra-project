@org.junit.Test
public void mapEnum() throws io.beanmapper.exceptions.BeanMappingException {
    io.beanmapper.testmodel.enums.ColorEntity colorEntity = new io.beanmapper.testmodel.enums.ColorEntity();
    colorEntity.setCurrentColor(ColorEntity.RGB.BLUE);
    io.beanmapper.testmodel.enums.ColorResult colorResult = beanMapper.map(colorEntity, io.beanmapper.testmodel.enums.ColorResult.class);
    org.junit.Assert.assertEquals(ColorEntity.RGB.BLUE, colorResult.currentColor);
}