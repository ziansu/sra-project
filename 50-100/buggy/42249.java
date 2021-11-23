public void work() {
    java.util.List<java.lang.String> tableList = new java.util.ArrayList();
    getTableList(tableList, taskBase.getMsgContent());
    if ((tableList.size()) == 0) {
        return ;
    }
    java.lang.String pullCmd = "pullProject.sh " + (com.piza.robot.core.ConfigUtil.getStrProp("zhiyu.projectDir"));
    if (!(pullCode(pullCmd))) {
        return ;
    }
    if (!(this.generate(tableList))) {
        return ;
    }
    commitCode();
}