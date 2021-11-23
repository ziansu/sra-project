private boolean isIDNumberExisted(java.lang.String idNumber) {
    com.edu.timebank.service.infrastructure.tableBean.UserEntityExample userEntityExample = new com.edu.timebank.service.infrastructure.tableBean.UserEntityExample();
    userEntityExample.createCriteria().andIdNumberEqualTo(idNumber);
    return !(userEntityMapper.selectByExample(userEntityExample).isEmpty());
}