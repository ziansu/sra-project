public java.lang.String add() {
    java.lang.String selectedNode = this.getSelectedNode();
    try {
        this.setStrutsAction(ApsAdminSystemConstants.ADD);
        this.setParentCategoryCode(selectedNode);
    } catch (java.lang.Throwable t) {
        com.agiletec.apsadmin.category.CategoryAction._logger.error("error in add", t);
        return FAILURE;
    }
    return SUCCESS;
}