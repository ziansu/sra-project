public com.pinterest.clusterservice.bean.AwsVmBean getGroupInfo(com.pinterest.arcee.handler.GroupBean groupBean) throws java.lang.Exception {
    com.pinterest.clusterservice.bean.AwsVmBean awsVmBean = asgDAO.getLaunchConfigInfo(groupBean.getLaunch_config_id());
    if (awsVmBean == null) {
        return null;
    }
    if ((groupBean.getSubnets()) != null) {
        awsVmBean.setSubnet(groupBean.getSubnets());
    }
    awsVmBean.setAsgStatus(ASGStatus.UNKNOWN);
    return awsVmBean;
}