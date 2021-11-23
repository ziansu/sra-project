@java.lang.Override
public void onPause() {
    super.onPause();
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).close();
}