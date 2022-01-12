public void onItemClick(android.widget.AdapterView parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.derek.whereabouts.MapsActivity.class);
    intent.putExtra("ROOM_ID", room);
    intent.putExtra("ROOM_NAME", roomName);
    intent.putExtra("USERNAME", username);
    startActivity(intent);
}