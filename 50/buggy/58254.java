public void onDestroy() {
    super.onDestroy();
    android.content.SharedPreferences pref = getSharedPreferences("SearchMyCarPreferences", Context.MODE_PRIVATE);
    pref.edit().putInt("isEditFilter", 0).commit();
    android.util.Log.d("lis", "destroyEdit");
}