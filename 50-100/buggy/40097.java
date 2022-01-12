public void runMissingChildrenNotRetrievedTest(mondrian.rolap.sql.MemberChildrenConstraint constraint) {
    fillChildren(children, 5);
    org.mockito.Mockito.when(childByNameConstraint.getChildNames()).thenReturn(java.util.Arrays.asList(new java.lang.String[]{ "Other Name" , "Other Name2" }));
    cacheHelper.putChildren(parentMember, constraint, children);
    java.util.List<mondrian.rolap.RolapMember> retrievedChildren = cacheHelper.getChildrenFromCache(parentMember, childByNameConstraint);
    assertEquals("Not expecting to retrieve anything from cache", null, retrievedChildren);
}