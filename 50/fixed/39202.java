public void deleteAllChannel() {
    com.tcl.gc.popgrid.util.Db4oUtil.delAll(com.tcl.gc.popgrid.dao.CategoryItem.class);
}