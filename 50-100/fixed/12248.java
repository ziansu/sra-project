public void accept(android.view.View view) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(MainActivity.KEY_VK, urlReader.getText().toString());
    editor.commit();
    android.content.Intent intent = new android.content.Intent(this, com.example.ivan.scoolguesohack.MainActivity.class);
    startActivity(intent);
}