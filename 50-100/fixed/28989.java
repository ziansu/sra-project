private void loadTileFromUi() {
    android.widget.EditText nameInput = ((android.widget.EditText) (findViewById(R.id.bg_name)));
    android.widget.EditText typeInput = ((android.widget.EditText) (findViewById(R.id.bg_type)));
    tile.setName(nameInput.getText().toString().trim());
    tile.setType(typeInput.getText().toString().trim());
}