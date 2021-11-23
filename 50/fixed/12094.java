@java.lang.Override
public com.ctrip.zeus.service.model.impl.Group add(com.ctrip.zeus.service.model.impl.Group group) throws java.lang.Exception {
    groupModelValidator.validate(group);
    autofill(group);
    groupEntityManager.add(group);
    syncVsAndGs(group);
    return group;
}