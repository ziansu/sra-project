@javax.transaction.Transactional
private net._100steps.bbter.service.model.UserDetail addDefaultUserDetail(int userId) {
    net._100steps.bbter.service.model.UserDetail userDetail = new net._100steps.bbter.service.model.UserDetail();
    userDetail.setUserId(userId);
    userDetail.setCreated(new java.util.Date());
    return userDetail;
}