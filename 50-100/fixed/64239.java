@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.google.zxing.integration.android.IntentResult scanningResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (resultCode != 0) {
        java.lang.String scanContent = scanningResult.getContents();
        if (scanContent.equalsIgnoreCase(MySaving().getStartStation().getStationName())) {
            DisplayTravelData();
            return ;
        }else {
            ShowMyDialog("Error", "You've scanned the wrong code, please try again");
            mLayout.setPanelState(SlidingUpPanelLayout.PanelState.HIDDEN);
        }
    }
    fab.callOnClick();
}