public void hideTile(android.view.View view) {
    android.widget.Toast.makeText(this, "Hide", Toast.LENGTH_SHORT).show();
    android.support.design.widget.FloatingActionButton fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab)));
    smallTile.setVisibility(View.VISIBLE);
    fab.setVisibility(View.VISIBLE);
    expandedTile.setVisibility(View.GONE);
    mMap.getUiSettings().setAllGesturesEnabled(true);
    android.widget.TextView mapIcon = ((android.widget.TextView) (findViewById(R.id.iconMap)));
    mapIcon.setClickable(true);
}