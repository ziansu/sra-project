public void ReturnClaim(android.view.MenuItem menu) {
    android.widget.Toast.makeText(this, "Returning to claimlist", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(this, com.cmput301w15t15.travelclaimsapp.activitys.AddClaimActivity.class);
    startActivity(intent);
}