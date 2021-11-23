@org.junit.Test
public void referencedNodeShouldReturnNullByDefault() {
    zhy2002.examples.lodgement.PersonGeneralNode personGeneralNode = personNode.getPersonGeneralNode();
    org.hamcrest.MatcherAssert.assertThat(personGeneralNode.getSpouseNode().getValue(), nullValue());
    zhy2002.neutron.UiNode<?> spouse = personGeneralNode.getSpouseNode().getReferencedNode();
    org.hamcrest.MatcherAssert.assertThat(spouse, nullValue());
}