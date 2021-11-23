@org.junit.Test
public void canResetAllValidationErrors() {
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));
    applicationNode.refresh();
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), greaterThan(0));
    applicationNode.resetValidationState();
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));
}