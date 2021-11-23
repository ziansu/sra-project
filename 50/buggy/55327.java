public void hideTile(android.view.View view) {
    android.widget.RelativeLayout expTile = ((android.widget.RelativeLayout) (findViewById(R.id.expandedTile)));
    android.widget.Toast.makeText(this, "Hide", Toast.LENGTH_SHORT).show();
    expTile.setVisibility(View.GONE);
}