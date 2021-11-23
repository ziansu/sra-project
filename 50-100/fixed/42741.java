@org.junit.Test
public void confirmIfUnitExists() throws java.lang.Exception {
    org.oscm.ui.dialog.mp.userGroups.ManageGroupCtrl mgc = new org.oscm.ui.dialog.mp.userGroups.ManageGroupCtrl() {
        @java.lang.Override
        public java.lang.String getSelectedGroupId() {
            return "1000";
        }
    };
    mgc.setManageGroupModel(model);
    doReturn(model.getSelectedGroup()).when(userGroupService).getUserGroupDetailsForList(org.mockito.Matchers.anyLong());
    java.lang.String result = ctrl.confirmIfUnitExists();
    org.junit.Assert.assertEquals(BaseBean.OUTCOME_EDIT_GROUP, result);
}