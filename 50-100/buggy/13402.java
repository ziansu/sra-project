@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    if (org.apache.commons.lang.StringUtils.isNotBlank(uid)) {
        mechanismUnit = mechanismUnitService.getMechanismUnit(uid);
        this.paging = createPaging(mechanismUnit.getCategoryOption().getOrganisationUnits().size());
        organisationUnits = new java.util.ArrayList(mechanismUnit.getCategoryOption().getOrganisationUnits());
    }else {
        return ERROR;
    }
    return SUCCESS;
}