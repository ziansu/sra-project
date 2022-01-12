public void advanceSide(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, com.essentialappsfm.sporttechniquesprinting.ComparisonActivity.class);
    java.lang.String userID = getIntent().getExtras().getString("userData");
    i.setData(userVid);
    i.putExtra("id", userID);
    android.widget.Toast.makeText(getApplicationContext(), ("User = " + userID), Toast.LENGTH_SHORT).show();
    startActivity(i);
}