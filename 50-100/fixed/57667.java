private void setMode(ch.ethz.inf.vs.android.g54.a4.SurvivalGuideActivity.Mode mode) {
    this.mode = mode;
    android.widget.LinearLayout lin_building = ((android.widget.LinearLayout) (findViewById(R.id.lin_building)));
    switch (this.mode) {
        case OVERVIEW :
            lin_building.setVisibility(View.GONE);
            break;
        case LOCATION :
        case FREEROOMS :
            lin_building.setVisibility(View.VISIBLE);
            break;
    }
    updateMap();
}