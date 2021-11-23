public void onClick(android.content.DialogInterface dialog, int which) {
    sharedPref = getSharedPreferences("myPref", this.MODE_PRIVATE);
    editor = sharedPref.edit();
    editor.putString("user_id", "0");
    editor.commit();
    finish();
    this.startActivity(new android.content.Intent(this, anonymousme.gitstar.Activities.Login.class));
}