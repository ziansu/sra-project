public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != (data.pvActiveSpriteId)) {
        data.pvActiveSpriteId = position;
        UpdateDisplay(container);
    }else {
    }
}