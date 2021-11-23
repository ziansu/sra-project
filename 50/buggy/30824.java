private vn.edu.hcmut.bkareer.common.Result delete(javax.servlet.http.HttpServletRequest req) {
    java.lang.String table = getStringParam(req, "table");
    vn.edu.hcmut.bkareer.common.ErrorCode result = null;
    result = DatabaseModel.Instance.truncateTable(table);
    return new vn.edu.hcmut.bkareer.common.Result(result);
}