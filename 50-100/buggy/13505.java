@org.junit.Test
public void canResetAllValidationErrors() {
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), org.hamcrest.Matchers.equalTo(0));
    applicationNode.refresh();
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), org.hamcrest.Matchers.greaterThan(0));
    applicationNode.resetValidationState();
    org.hamcrest.MatcherAssert.assertThat(applicationNode.getErrorListNode().getItemCount(), org.hamcrest.Matchers.equalTo(0));
}