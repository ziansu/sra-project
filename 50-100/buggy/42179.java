public java.lang.String UpdateCheckInRawDataRecord(java.lang.String id, java.lang.String workGroup) {
    hQueryHandle.setTableHandle(new com.jsp.support.PersonalMenu.Work_Group_Info(new com.jsp.support.PersonalMenu.EarthquakeManagement()));
    com.jsp.support.PersonalMenu.Check_In_Raw_Data hCIRDHandle = new com.jsp.support.PersonalMenu.Check_In_Raw_Data(new com.jsp.support.PersonalMenu.EarthquakeManagement());
    java.lang.String workGroupId = hQueryHandle.GetTableContentByKeyWord("group_name", workGroup, "id").get(0);
    hCIRDHandle.UpdateRecordByKeyList("work_group", workGroupId, java.util.Arrays.asList("id"), java.util.Arrays.asList(id));
    return "";
}