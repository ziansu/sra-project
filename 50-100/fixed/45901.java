@org.testng.annotations.Test
public void deleteOneGroup() {
    int index = extendedGroupIndexGettind();
    com.example.utilits.SortedListOf<com.example.tests.ObjGroup> beforeGroupsList = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(index).deleteGroup();
    com.example.utilits.SortedListOf<com.example.tests.ObjGroup> afterGroupsList = app.getGroupHelper().getGroupList();
    org.junit.Assert.assertThat(afterGroupsList, equalTo(beforeGroupsList.without((index - 1))));
}