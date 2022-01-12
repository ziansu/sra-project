public void expandTile(android.view.View view) {
    android.widget.Toast.makeText(this, "Expand", Toast.LENGTH_SHORT).show();
    android.support.design.widget.FloatingActionButton fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab)));
    smallTile.setVisibility(View.GONE);
    fab.setVisibility(View.GONE);
    expandedTile.setVisibility(View.VISIBLE);
    mMap.getUiSettings().setAllGesturesEnabled(false);
    android.widget.TextView mapIcon = ((android.widget.TextView) (findViewById(R.id.iconMap)));
    mapIcon.setClickable(false);
}