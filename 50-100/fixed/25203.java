public java.lang.String remove() {
    refreshPageData();
    if (null != (id)) {
        try {
            dishService.deleteDish(java.lang.Long.parseLong(id));
            this.setMessage(com.innovaee.eorder.utils.MessageUtil.getMessage("delete_success"));
        } catch (java.lang.Exception e) {
            this.setMessage(e.getMessage());
            return ERROR;
        } finally {
            getDishList();
            renewCategoryVOList();
        }
    }
    return SUCCESS;
}