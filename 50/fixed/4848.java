protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.monstersfromtheid.imready.DefineAccount.ACTIVITY_GOT_ACCOUNT)) {
        finish();
    }
}