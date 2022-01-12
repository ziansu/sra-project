private void setCursorPixmap() {
    com.uwsoft.editor.view.ui.widget.CursorData currentCursor = overrideCursor;
    if (currentCursor == null) {
        currentCursor = cursor;
    }
    com.badlogic.gdx.graphics.Pixmap pm = new com.badlogic.gdx.graphics.Pixmap(Gdx.files.internal((("cursors/" + (currentCursor.region)) + ".png")));
    com.badlogic.gdx.graphics.Cursor cursorObj = Gdx.graphics.newCursor(pm, currentCursor.getHotspotX(), currentCursor.getHotspotY());
    Gdx.graphics.setCursor(cursorObj);
    pm.dispose();
}