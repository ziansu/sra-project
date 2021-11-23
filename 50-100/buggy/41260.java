public static com.badlogic.gdx.scenes.scene2d.ui.TextField addTextField(java.lang.String labelText, com.badlogic.gdx.scenes.scene2d.ui.Table parent, com.badlogic.gdx.scenes.scene2d.ui.Skin skin) {
    com.badlogic.gdx.scenes.scene2d.ui.Label label = new com.badlogic.gdx.scenes.scene2d.ui.Label(labelText, skin);
    label.setAlignment(Align.left);
    parent.add(label).left();
    com.badlogic.gdx.scenes.scene2d.ui.TextField info = new com.badlogic.gdx.scenes.scene2d.ui.TextField("", skin);
    parent.add(info).right().row().fillX().expandX();
    return info;
}