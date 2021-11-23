private void openActivity(java.lang.Class myClass) {
    android.content.Intent intent = new android.content.Intent(this, myClass);
    startActivity(intent);
}