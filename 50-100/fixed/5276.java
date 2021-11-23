@java.lang.Override
protected void onPostExecute(java.lang.Boolean isVarsityPlayer) {
    if (isVarsityPlayer) {
        showVerifyVarsityPlayerDialog(userNickname, playerProfile);
    }else {
        finish();
        android.content.Intent intent = new android.content.Intent(this, com.peprally.jeremy.peprally.activities.HomeActivity.class);
        intent.putExtra("NICKNAME", userNickname);
        startActivity(intent);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}