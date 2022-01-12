public void addPlayer(android.view.View view) {
    java.lang.String new_player = player_edit.getText().toString();
    gui.pairings.Player player = new gui.pairings.Player(new_player, ((selectionList.size()) + 1));
    selectionList.add(player);
    adapter.notifyDataSetChanged();
    player_edit.setText("");
}