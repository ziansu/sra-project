public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.widget.Toast.makeText(this, ("Category selected " + position), Toast.LENGTH_SHORT).show();
    java.lang.String mItemSelected = parent.getItemAtPosition(position).toString();
    android.content.Intent mIntent = new android.content.Intent(this, buyerseller.cs646.sdsu.edu.sellit.CategoryItemSubItemActivity.class);
    mIntent.putExtra("SelectedItem", mItemSelected);
    startActivity(mIntent);
}