public void onStartAgain(android.view.View view) {
    android.util.Log.v(com.example.kirstiebooras.colors.activities.ColorActivity.TAG, "onStartAgain");
    android.content.Intent intent = new android.content.Intent(this, com.example.kirstiebooras.colors.activities.MainActivity.class);
    startActivity(intent);
}