private void checkReadAcl(us.kbase.shock.client.ShockNode node, java.util.List<us.kbase.shock.client.ShockUserId> uuids) throws java.lang.Exception {
    org.junit.Assert.assertThat("correct shock acls", node.getACLs(us.kbase.workspace.test.kbase.HandleTest.READ_ACL).getRead(), org.hamcrest.CoreMatchers.is(uuids));
}