@org.junit.Test
public void multipleUnwrap() {
    io.beanmapper.testmodel.multipleunwrap.LayerA source = io.beanmapper.testmodel.multipleunwrap.LayerA.create();
    io.beanmapper.testmodel.multipleunwrap.AllTogether target = beanMapper.map(source, io.beanmapper.testmodel.multipleunwrap.AllTogether.class);
    org.junit.Assert.assertEquals("name1", target.getName1());
    org.junit.Assert.assertEquals("name2", target.getName2());
    org.junit.Assert.assertEquals("name3", target.getName3());
}