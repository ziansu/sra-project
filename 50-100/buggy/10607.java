@java.lang.Override
protected java.lang.String processRequest(cn.edu.fudan.request.AddTableRequest request, cn.edu.fudan.util.Session session) throws java.lang.Exception {
    return (request == null) || ((request.table()) == (AddTableRequest.Table.DEFAULT)) ? "error" : (new cn.edu.fudan.dao.AddTableDAO(this, request).getResult()) > 0 ? "success" : "fail";
}