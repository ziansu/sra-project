@java.lang.Override
public boolean updateChildSex(long userId, long childId, java.lang.String sex) {
    if ((((userId <= 0) || (childId <= 0)) || (org.apache.commons.lang3.StringUtils.isBlank(sex))) || (!(cn.momia.service.user.facade.impl.UserServiceFacadeImpl.SEX.contains(sex))))
        return false;
    
    return participantService.updateSex(userId, childId, sex);
}