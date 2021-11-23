@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int pos, long id) {
    android.util.Log.d("INFO", "SPINNER SELECTED");
    java.lang.String endPoint = "";
    java.lang.String item = ((java.lang.String) (adapterView.getItemAtPosition(pos)));
    if (item.equals("Most Popular")) {
        endPoint = "popular";
    }else {
        endPoint = "top_rated";
    }
    loadMovies(this, endPoint);
}