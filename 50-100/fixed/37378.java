public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.widget.Toast.makeText(getApplicationContext(), (("Pos: " + position) + " Id: "), Toast.LENGTH_SHORT).show();
    map[position] = 1 + "";
    draw(map);
}