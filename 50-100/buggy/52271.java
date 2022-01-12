@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/attr")
public javax.ws.rs.core.Response getSchoolByAttr() {
    int statusCode = com.loocha.exception.ServerInternalException.OPERATION_SUCCESS;
    java.util.List<com.loocha.bean.SchoolProp> list = null;
    try {
        com.loocha.dao.exam.SchoolDAO dao = com.loocha.dao.LoochaDAOFactory.getInstance().getSchoolDAO();
        list = dao.querySchoolByAttrs();
    } catch (java.lang.Exception e) {
        statusCode = com.loocha.resources.ServerUtil.formatException(e);
        logger.fatal("get school prop failed :");
        e.printStackTrace();
    }
    return com.loocha.resources.ServerUtil.createResponse(statusCode, list);
}