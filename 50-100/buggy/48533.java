protected void onAttack(android.view.View v) {
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.taps)));
    try {
        java.lang.String string = editText.getText().toString();
        com.bugsnguns.asprokopov.tapattack.ChooseTargetActivity.tapsToWin = java.lang.Integer.parseInt(string);
        if ((com.bugsnguns.asprokopov.tapattack.ChooseTargetActivity.tapsToWin) == 0) {
            throw new java.lang.Exception();
        }
        android.content.Intent intent = new android.content.Intent(this, com.bugsnguns.asprokopov.tapattack.BattleActivity.class);
        startActivity(intent);
    } catch (java.lang.Exception e) {
    }
}