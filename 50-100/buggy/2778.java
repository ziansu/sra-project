@org.junit.Test
@org.springframework.transaction.annotation.Transactional
@org.springframework.test.annotation.Rollback(value = true)
public void testGetRoles() throws ca.uhnresearch.pughlab.tracker.dao.RepositoryException {
    ca.uhnresearch.pughlab.tracker.dao.CaseQuery query = new ca.uhnresearch.pughlab.tracker.dao.CaseQuery();
    query.setOffset(0);
    query.setLimit(10);
    ca.uhnresearch.pughlab.tracker.dto.Study study = org.easymock.EasyMock.createMock(ca.uhnresearch.pughlab.tracker.dto.Study.class);
    org.easymock.EasyMock.expect(study.getId()).andStubReturn(2);
    org.easymock.EasyMock.replay(study);
    java.util.List<ca.uhnresearch.pughlab.tracker.dto.Role> list = authorizationRepository.getStudyRoles(study, query);
    junit.framework.Assert.assertNotNull(list);
    junit.framework.Assert.assertEquals(3, list.size());
}