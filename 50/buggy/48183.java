private void changeRangeTemp(com.example.perk.xtremegreenclient.Ranges range) {
    android.content.Intent intent = new android.content.Intent(this, com.example.perk.xtremegreenclient.RangeSetterActivity.class);
    intent.putExtra("Range", range);
    startActivity(intent);
}