@java.lang.Override
@org.springframework.cache.annotation.CachePut(value = "apply", key = "#applyInfo.getId()+#session.getId()")
public void saveApply(com.example.demo.entity.dataModel.ApplyInfo applyInfo, org.apache.shiro.session.Session session) {
    validateService.isPermission(session, applyInfo.getId());
    applyInfo.setOwnerId(statusService.getCurrUserId(session));
    applyDao.save(applyInfo);
}