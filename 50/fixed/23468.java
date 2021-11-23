@java.lang.Override
protected java.lang.String getLimitsForQuery() {
    tel_ran.tests.entitys.EntityCompany ec = getCompany();
    return ("companyId='" + (ec.getId())) + "'";
}