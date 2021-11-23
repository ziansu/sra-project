@org.junit.Test
public void referencedNodeShouldReturnNullByDefault() {
    zhy2002.examples.lodgement.PersonGeneralNode personGeneralNode = personNode.getPersonGeneralNode();
    org.hamcrest.MatcherAssert.assertThat(personGeneralNode.getSpouseNode().getValue(), org.hamcrest.Matchers.nullValue());
    zhy2002.neutron.UiNode<?> spouse = personGeneralNode.getSpouseNode().getReferencedNode();
    org.hamcrest.MatcherAssert.assertThat(spouse, org.hamcrest.Matchers.nullValue());
}