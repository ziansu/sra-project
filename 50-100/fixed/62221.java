public void updateLoadState() {
    if (((loadeditems) == 4) && (!(itemloaded))) {
        android.widget.Toast.makeText(getActivity(), "Route not found. Locations entered may not be valid.", Toast.LENGTH_LONG).show();
        myMain.goBack();
    }else
        if (itemloaded) {
            rlTopBar.setVisibility(View.VISIBLE);
        }
    
    if ((loadeditems) == 4) {
        llLoading.setVisibility(View.GONE);
    }
}