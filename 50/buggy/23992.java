@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    com.horse.core.ServerConnection.closeConnection();
}