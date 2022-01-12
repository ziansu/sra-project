@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    dataSource = new org.melayjaire.boimela.data.BookDataSource(activity);
    dataSource.open();
}