@org.junit.Test
public void similarSubclasses() {
    io.beanmapper.testmodel.similarsubclasses.SimilarSubclass subclass = new io.beanmapper.testmodel.similarsubclasses.SimilarSubclass();
    subclass.name = "Henk";
    io.beanmapper.testmodel.similarsubclasses.DifferentSource source = new io.beanmapper.testmodel.similarsubclasses.DifferentSource();
    source.subclass = subclass;
    io.beanmapper.testmodel.similarsubclasses.DifferentTarget target = beanMapper.map(source, io.beanmapper.testmodel.similarsubclasses.DifferentTarget.class);
    org.junit.Assert.assertEquals(source.subclass, target.subclass);
}