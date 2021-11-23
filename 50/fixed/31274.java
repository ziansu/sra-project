@org.junit.Test
public void testLoadCommitmentsEmpty() throws java.lang.Exception {
    java.util.List<bean.CommitmentBean> actual = commitmentsDAO.loadCommitments(1);
    java.util.List<bean.CommitmentBean> expected = new java.util.ArrayList<bean.CommitmentBean>();
    org.junit.Assert.assertEquals(actual, expected);
}