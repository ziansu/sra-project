private void OpenBattleScreen(java.lang.String teacherCode) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), docentengo.fontys.nl.docentengo.BattleActivity.class);
    intent.putExtra("CurrentUser", getIntent().getExtras().getSerializable("BattleMode"));
    intent.putExtra("TeacherCode", teacherCode);
    startActivity(intent);
    finish();
}