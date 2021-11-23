public void btnAddOnClick(android.view.View view) {
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra(BuildDeckActivity.CARD_ID, "bil125");
    setResult(manningk.bettercurve.RESULT_OK, resultIntent);
}