@org.junit.Test
public void employmentEndedNodeIsNotLoadedForCurrentEmployment() {
    zhy2002.examples.lodgement.CurrentEmploymentNode currentEmploymentNode = personNode.getCurrentEmploymentListNode().createItem();
    org.hamcrest.MatcherAssert.assertThat(currentEmploymentNode.getPayeEmployedNode().getEmploymentEndedNode().getNodeStatus(), org.hamcrest.Matchers.equalTo(NodeStatusEnum.Unloaded));
    zhy2002.examples.lodgement.PreviousEmploymentNode previousEmploymentNode = personNode.getPreviousEmploymentListNode().createItem();
    org.hamcrest.MatcherAssert.assertThat(previousEmploymentNode.getSelfEmployedNode().getEmploymentEndedNode().getNodeStatus(), org.hamcrest.Matchers.equalTo(NodeStatusEnum.Loaded));
}