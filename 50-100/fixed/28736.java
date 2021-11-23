private void showAboutDialog() {
    android.app.AlertDialog.Builder alertadd = new android.app.AlertDialog.Builder(this);
    android.view.LayoutInflater factory = android.view.LayoutInflater.from(this);
    final android.view.View view = factory.inflate(R.layout.about, null);
    alertadd.setView(view);
    alertadd.show();
}