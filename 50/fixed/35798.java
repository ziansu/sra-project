@java.lang.Override
public com.ctrip.zeus.service.model.impl.Group update(com.ctrip.zeus.service.model.impl.Group group) throws java.lang.Exception {
    groupModelValidator.validate(group);
    autofill(group);
    groupEntityManager.update(group);
    syncVsAndGs(group);
    return group;
}