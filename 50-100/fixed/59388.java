@org.junit.Test
public void employmentEndedNodeIsNotLoadedForCurrentEmployment() {
    zhy2002.examples.lodgement.CurrentEmploymentNode currentEmploymentNode = personNode.getCurrentEmploymentListNode().createItem();
    org.hamcrest.MatcherAssert.assertThat(currentEmploymentNode.getPayeEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Unloaded));
    zhy2002.examples.lodgement.PreviousEmploymentNode previousEmploymentNode = personNode.getPreviousEmploymentListNode().createItem();
    org.hamcrest.MatcherAssert.assertThat(previousEmploymentNode.getSelfEmployedNode().getEmploymentEndedNode().getNodeStatus(), equalTo(NodeStatusEnum.Loaded));
}