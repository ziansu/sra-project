public static java.util.List<com.aimluck.eip.facilities.FacilityGroupResultData> getFacilityGroupList(java.lang.String groupname) {
    com.aimluck.eip.orm.query.SelectQuery<com.aimluck.eip.cayenne.om.portlet.EipMFacilityGroup> query = com.aimluck.eip.orm.Database.query(com.aimluck.eip.cayenne.om.portlet.EipMFacilityGroup.class);
    query.orderAscending(EipMFacilityGroup.SORT_PROPERTY);
    java.util.List<com.aimluck.eip.facilities.FacilityGroupResultData> list = com.aimluck.eip.facilities.util.FacilitiesUtils.getFacilityGroupResultList(query.fetchList());
    return list;
}