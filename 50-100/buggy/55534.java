@java.lang.Override
public void validate() {
    super.validate();
    if (((this.getStrutsAction()) == (com.agiletec.apsadmin.system.ApsAdminSystemConstants.ADD)) || ((this.getStrutsAction()) == (com.agiletec.apsadmin.system.ApsAdminSystemConstants.PASTE))) {
        this.checkParentNode(this.getParentCategoryCode());
    }
    this.checkCode();
    this.checkTitles();
}