public void onSucess(java.lang.Class view) {
    android.content.Intent intent = new android.content.Intent(this, view);
    startActivity(intent);
}