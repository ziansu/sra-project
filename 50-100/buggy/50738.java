public java.lang.String add() {
    java.lang.String selectedNode = this.getSelectedNode();
    try {
        java.lang.System.out.println("===============");
        java.lang.System.out.println(selectedNode);
        java.lang.System.out.println("===============");
        this.setStrutsAction(ApsAdminSystemConstants.ADD);
        java.lang.System.out.println(selectedNode);
        this.setParentCategoryCode(selectedNode);
    } catch (java.lang.Throwable t) {
        com.agiletec.apsadmin.category.CategoryAction._logger.error("error in add", t);
        return FAILURE;
    }
    return SUCCESS;
}