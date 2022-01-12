public void go(android.view.View view) {
    android.content.Intent fight = new android.content.Intent(this, sikware.com.gladitor.Fight.class);
    fight.putExtra("arena", rbg.getCheckedRadioButtonId());
    startActivity(fight);
}