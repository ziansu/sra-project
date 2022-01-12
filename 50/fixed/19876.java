private void close() {
    com.belspec.app.utils.UserManager.getInstanse().logout();
    super.onBackPressed();
}