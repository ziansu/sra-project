public int checkUserList(java.lang.String col_name, java.lang.String specify_value, java.lang.String search_value, java.lang.Integer pagenum) {
    java.lang.System.out.println("Here is UserServices.checkUserList method...");
    if ((pagenum == null) || (pagenum == 0))
        pagenum = 1;
    
    com.github.pagehelper.PageHelper.startPage(pagenum, 1);
    java.util.List<com.bbcall.mybatis.table.User> userlist = userMapper.listUserOrderBy(col_name, specify_value, search_value);
    if ((userlist.size()) > 0) {
        this.userlist = userlist;
        return com.bbcall.functions.ResultCode.SUCCESS;
    }else {
        return com.bbcall.functions.ResultCode.USERLIST_NULL;
    }
}