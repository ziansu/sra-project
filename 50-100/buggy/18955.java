public void onClick(android.content.DialogInterface dialog, int which) {
    sharedPref = getSharedPreferences("myPref", getApplicationContext().MODE_PRIVATE);
    editor = sharedPref.edit();
    editor.putString("user_id", "0");
    editor.commit();
    finish();
    getApplicationContext().startActivity(new android.content.Intent(getApplicationContext(), anonymousme.gitstar.Activities.Login.class));
}