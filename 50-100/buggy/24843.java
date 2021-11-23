@org.junit.Test
public void nonStringToString() {
    io.beanmapper.testmodel.tostring.SourceWithNonString obj = new io.beanmapper.testmodel.tostring.SourceWithNonString();
    obj.setDate(java.time.LocalDate.of(2015, 4, 1));
    io.beanmapper.testmodel.tostring.TargetWithString view = beanMapper.map(obj, io.beanmapper.testmodel.tostring.TargetWithString.class);
    org.junit.Assert.assertEquals("2015-04-01", view.getDate());
}