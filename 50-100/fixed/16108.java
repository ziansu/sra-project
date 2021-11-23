@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (DarkKnightActivity.RESULT_LOAD_PGN)) && (data != null)) {
        android.content.Intent i = new android.content.Intent(this, org.empyrn.darkknight.DarkKnightActivity.class);
        i.putExtra("pgnData", data.getAction());
        startActivity(i);
        finish();
    }
    super.onActivityResult(requestCode, resultCode, data);
}