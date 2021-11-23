@org.junit.Test
@org.springframework.transaction.annotation.Transactional
@org.springframework.test.annotation.Rollback(value = true)
public void testGetRolesQueryPattern() throws ca.uhnresearch.pughlab.tracker.dao.RepositoryException {
    ca.uhnresearch.pughlab.tracker.dto.Study study = org.easymock.EasyMock.createMock(ca.uhnresearch.pughlab.tracker.dto.Study.class);
    org.easymock.EasyMock.expect(study.getId()).andReturn(0);
    org.easymock.EasyMock.replay(study);
    ca.uhnresearch.pughlab.tracker.dao.CaseQuery query = new ca.uhnresearch.pughlab.tracker.dao.CaseQuery();
    query.setPattern("DEMO");
    java.util.List<ca.uhnresearch.pughlab.tracker.dto.Role> list = authorizationRepository.getStudyRoles(study, query);
    junit.framework.Assert.assertNotNull(list);
    junit.framework.Assert.assertEquals(3, list.size());
}