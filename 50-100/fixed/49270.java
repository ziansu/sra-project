@org.junit.Test
public void initSelectedGroup() throws java.lang.Exception {
    org.oscm.internal.usergroupmgmt.POUserGroup group = new org.oscm.internal.usergroupmgmt.POUserGroup();
    doReturn(group).when(userGroupService).getUserGroupDetailsForList(org.mockito.Matchers.anyLong());
    ctrl.initSelectedGroup();
    org.junit.Assert.assertEquals(group, model.getSelectedGroup());
}