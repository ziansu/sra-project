public com.pinterest.arcee.handler.GroupInfoBean getGroupInfoByClusterName(java.lang.String clusterName) throws java.lang.Exception {
    com.pinterest.clusterservice.bean.AwsVmBean awsVmBean = asgDAO.getAutoScalingGroupInfo(clusterName);
    com.pinterest.arcee.handler.GroupBean oldBean = groupInfoDAO.getGroupInfo(clusterName);
    if ((awsVmBean == null) && (oldBean == null)) {
        return null;
    }else
        if (awsVmBean == null) {
            awsVmBean = getGroupInfo(oldBean);
        }
    
    com.pinterest.arcee.handler.GroupInfoBean groupInfoBean = new com.pinterest.arcee.handler.GroupInfoBean();
    groupInfoBean.setAwsVmBean(awsVmBean);
    groupInfoBean.setGroupBean(oldBean);
    return groupInfoBean;
}