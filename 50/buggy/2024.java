@java.lang.Override
public com.example.demo.entity.dataModel.ApplyInfo findByApplyID(java.lang.Long ID, org.apache.shiro.subject.Subject subject) throws com.example.demo.service.exception.NotFoundException {
    com.example.demo.entity.dataModel.ApplyInfo applyInfo = applyDao.findApplyInfoById(ID);
    validateService.isPermission(subject, ID);
    return applyInfo;
}