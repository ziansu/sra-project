public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    java.lang.String city2Get = "q=" + (parent.getSelectedItem());
    if (pos != 0) {
        android.widget.Toast.makeText(parent.getContext(), parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
        getWeather(city2Get);
    }
}