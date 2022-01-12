@org.junit.Test
@org.springframework.transaction.annotation.Transactional
@org.springframework.test.annotation.Rollback(value = true)
public void testGetRoleCount() {
    ca.uhnresearch.pughlab.tracker.dao.CaseQuery query = new ca.uhnresearch.pughlab.tracker.dao.CaseQuery();
    ca.uhnresearch.pughlab.tracker.dto.Study study = org.easymock.EasyMock.createMock(ca.uhnresearch.pughlab.tracker.dto.Study.class);
    org.easymock.EasyMock.expect(study.getId()).andStubReturn(2);
    org.easymock.EasyMock.replay(study);
    java.lang.Long count = authorizationRepository.getStudyRoleCount(study, query);
    junit.framework.Assert.assertEquals(3, count.longValue());
}