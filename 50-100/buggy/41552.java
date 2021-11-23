@org.junit.Test
public void multipleUnwrapReversed() {
    io.beanmapper.testmodel.multipleunwrap.AllTogether source = new io.beanmapper.testmodel.multipleunwrap.AllTogether();
    source.setName1("name1");
    source.setName2("name2");
    source.setName3("name3");
    io.beanmapper.testmodel.multipleunwrap.LayerA target = beanMapper.map(source, io.beanmapper.testmodel.multipleunwrap.LayerA.class);
    org.junit.Assert.assertEquals("name1", target.getName1());
    org.junit.Assert.assertEquals("name2", target.getLayerB().getName2());
    org.junit.Assert.assertEquals("name3", target.getLayerB().getLayerC().getName3());
}