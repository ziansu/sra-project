@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.CMPUT301W15T02.teamtoapp.Claim claim = sessionController.getClaims().get(position);
    sessionController.setClaim(claim);
    android.content.Intent intent = new android.content.Intent(this, com.CMPUT301W15T02.teamtoapp.ClaimantExpenseListActivity.class);
    startActivity(intent);
}