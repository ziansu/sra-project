@org.junit.Test
public void multipleUnwrap() {
    io.beanmapper.testmodel.multipleunwrap.LayerA source = io.beanmapper.testmodel.multipleunwrap.LayerA.create();
    io.beanmapper.testmodel.multipleunwrap.AllTogether target = beanMapper.map(source, io.beanmapper.testmodel.multipleunwrap.AllTogether.class);
    assertEquals("name1", target.getName1());
    assertEquals("name2", target.getName2());
    assertEquals("name3", target.getName3());
}