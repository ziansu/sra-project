public void onClickFinalize(android.view.View view) {
    android.content.Intent newIntent = new android.content.Intent(getApplicationContext(), pinkteampdm.farmerhelper.PlantActivity.class);
    newIntent.putExtra("cultures", insertedCulturesArray);
    newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(newIntent);
}