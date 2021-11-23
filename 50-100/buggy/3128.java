public static java.util.List<com.aimluck.eip.facilities.FacilityGroupResultData> getFacilityGroupList(java.lang.String groupname) {
    java.util.List<com.aimluck.eip.facilities.FacilityGroupResultData> list = new java.util.ArrayList<com.aimluck.eip.facilities.FacilityGroupResultData>();
    com.aimluck.eip.orm.query.SelectQuery<com.aimluck.eip.cayenne.om.portlet.EipMFacilityGroup> query = com.aimluck.eip.orm.Database.query(com.aimluck.eip.cayenne.om.portlet.EipMFacilityGroup.class);
    query.orderAscending(EipMFacilityGroup.SORT_PROPERTY);
    list = com.aimluck.eip.facilities.util.FacilitiesUtils.getFacilityGroupResultList(query.fetchList());
    return list;
}