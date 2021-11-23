@org.junit.Test
public void testGetLabel__String_String() {
    de.hu_berlin.u.saltnpepper.graph.Label label = de.hu_berlin.u.saltnpepper.graph.impl.GraphFactory.createLabel();
    label.setNamespace("sNS");
    label.setName("name");
    this.getFixture().addLabel(label);
    org.junit.Assert.assertEquals(label, this.getFixture().getLabel(label.getNamespace(), label.getName()));
}