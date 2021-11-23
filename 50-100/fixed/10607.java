@java.lang.Override
protected java.lang.String processRequest(cn.edu.fudan.request.AddTableRequest request, cn.edu.fudan.util.Session session) throws java.lang.Exception {
    if ((request == null) || ((request.table()) == (AddTableRequest.Table.DEFAULT)))
        return "error";
    
    java.lang.Integer result = new cn.edu.fudan.dao.AddTableDAO(this, request).getResult();
    return (result != null) && (result > 0) ? "success" : "fail";
}