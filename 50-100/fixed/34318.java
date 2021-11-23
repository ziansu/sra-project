@java.lang.Override
public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    verifyArguments(target, errors);
    org.openlmis.referencedata.domain.RequisitionGroup group = ((org.openlmis.referencedata.domain.RequisitionGroup) (target));
    verifyProperties(group, errors);
    if (!(errors.hasErrors())) {
        verifyCode(group.getId(), group.getCode(), errors);
        verifySupervisoryNode(group.getSupervisoryNode(), errors);
        verifyFacilities(group.getMemberFacilities(), errors);
    }
}