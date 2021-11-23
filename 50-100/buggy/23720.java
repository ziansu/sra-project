@java.lang.Override
public java.lang.String getTestsResultsAll(long companyId, java.lang.String timeZone) {
    this.id = companyId;
    java.lang.String res = "";
    tel_ran.tests.entitys.EntityCompany company = getCompany();
    if (company != null) {
        @java.lang.SuppressWarnings(value = "unchecked")
        java.util.List<tel_ran.tests.entitys.EntityTest> tests = ((java.util.List<tel_ran.tests.entitys.EntityTest>) (em.createQuery("SELECT t FROM EntityTest t WHERE t.endTestDate!=0 AND t.entityCompany = :company ORDER BY t.entityPerson").setParameter("company", company).getResultList()));
        res = generateJsonResponseCommon(tests, timeZone);
    }
    return res;
}