@java.lang.Override
protected void onDestroy() {
    mainActivityHelper.saveDatabase();
    se.chalmers.projektgrupplp4.studentlivinggbg.Db4oDatabase.getInstance().close();
    super.onDestroy();
}