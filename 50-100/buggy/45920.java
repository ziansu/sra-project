private net.mwplay.nativefont.NativeLabel addLabel50(java.lang.String text, com.badlogic.gdx.math.Vector2 pos, com.badlogic.gdx.graphics.Color strokeColor) {
    label = new net.mwplay.nativefont.NativeLabel("", game.fonts.get("font50"), com.badlogic.gdx.graphics.Color.BLACK);
    label.setText(text);
    label.setPosition(pos.x, pos.y);
    label.setStroke(strokeColor, 1);
    stage.addActor(label);
    return label;
}