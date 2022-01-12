@org.junit.Test
public void initiallyUnmatchedSourceMustBeUsed() {
    io.beanmapper.testmodel.initiallyunmatchedsource.SourceWithUnmatchedField swuf = new io.beanmapper.testmodel.initiallyunmatchedsource.SourceWithUnmatchedField();
    swuf.setName("Henk");
    swuf.setCountry("NL");
    io.beanmapper.testmodel.initiallyunmatchedsource.TargetWithoutUnmatchedField twuf = beanMapper.map(swuf, new io.beanmapper.testmodel.initiallyunmatchedsource.TargetWithoutUnmatchedField());
    org.junit.Assert.assertEquals("Henk", twuf.getName());
    org.junit.Assert.assertEquals("NL", twuf.getNation());
}