public java.lang.String list() throws java.lang.Exception {
    java.util.List departmentList = null;
    if ((parentId) == null) {
        departmentList = departmentService.findTopList();
    }else {
        departmentList = departmentService.findChildList(model.getId());
    }
    com.opensymphony.xwork2.ActionContext.getContext().put("departmentList", departmentList);
    return "list";
}