public void deleteAllChannel() {
    long a = java.lang.System.currentTimeMillis();
    com.tcl.gc.popgrid.util.Db4oUtil.delAll(com.tcl.gc.popgrid.dao.CategoryItem.class);
    long b = (java.lang.System.currentTimeMillis()) - a;
    android.util.Log.e("yy", ("deleteAllChannel time:" + b));
}