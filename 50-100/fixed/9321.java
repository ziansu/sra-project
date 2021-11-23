public com.pactera.web.model.Department findById(java.lang.Integer deptno) throws com.pactera.web.exception.ServiceException {
    final java.lang.String METHOD_NAME = "findById";
    log.debug((METHOD_NAME + " begin"));
    log.debug(((METHOD_NAME + " deptno : ") + deptno));
    com.pactera.web.model.Department dept = departmentDAO.getOne(deptno);
    log.debug((METHOD_NAME + " end"));
    return dept;
}