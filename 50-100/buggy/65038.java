public void onClick(android.content.DialogInterface dialog, int whichButton) {
    if (optionIndex == 0) {
        setResult(team21.pylonconstructor.RESULT_OK);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("userinfo", team21.pylonconstructor.MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", "");
        editor.apply();
        android.content.Intent intent = new android.content.Intent(this, team21.pylonconstructor.LoginActivity.class);
        startActivity(intent);
        finish();
    }else {
    }
}