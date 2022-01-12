public java.util.List<com.ymt.testplatform.entity.Testsuite> findAllTestsuitesByApplicationId(java.lang.Integer applicationid, java.lang.Integer departmentid, java.lang.Integer pageSize, java.lang.Integer pageIndex) {
    java.lang.String hql = "from Testsuite t where t.del = 0 ";
    if (applicationid != null) {
        hql += " and t.application.id = " + applicationid;
    }
    if (departmentid != null) {
        hql += " and t.application.department.id = " + departmentid;
    }
    hql += " group by t.application.id";
    return testsuiteDAO.findByHql(hql, null, pageSize, pageIndex);
}