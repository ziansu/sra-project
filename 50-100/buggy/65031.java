@com.pinterest.teletraan.resource.GET
@com.pinterest.teletraan.resource.Path(value = "/spot_instances/spot_name")
public java.lang.String getSpotNameByClusterName(@javax.ws.rs.core.Context
javax.ws.rs.core.SecurityContext sc, @com.pinterest.teletraan.resource.PathParam(value = "groupName")
java.lang.String groupName) throws java.lang.Exception {
    java.util.Collection<com.pinterest.teletraan.resource.GroupMappingBean> mapping = groupMappingDAO.getGroupMappingsByCluster(groupName);
    com.pinterest.teletraan.resource.GroupMappingBean bean = mapping.iterator().next();
    if (bean != null) {
        return ("\"" + (bean.getAsg_group_name())) + "\"";
    }
    return "";
}