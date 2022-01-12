private void addLabelTTF(java.lang.String text, com.badlogic.gdx.math.Vector2 pos, com.badlogic.gdx.graphics.Color strokeColor) {
    label = new net.mwplay.nativefont.NativeLabel("", game.fonts.get("ttffont"), com.badlogic.gdx.graphics.Color.BLACK);
    label.setText(text);
    label.setPosition(pos.x, pos.y);
    label.setStroke(strokeColor);
    stage.addActor(label);
}