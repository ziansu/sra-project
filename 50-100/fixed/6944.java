public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox addCheckBox(java.lang.String labelText, com.badlogic.gdx.scenes.scene2d.ui.Table parent, com.badlogic.gdx.scenes.scene2d.ui.Skin skin) {
    com.badlogic.gdx.scenes.scene2d.ui.CheckBox info = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox(labelText, skin);
    parent.add(info).right().fillX().expandX().row();
    return info;
}