public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle generateStyle(com.uwsoft.editor.renderer.resources.IResourceRetriever rManager, java.lang.String fontName, int size, float[] tint) {
    if (size == 0) {
        size = com.uwsoft.editor.renderer.factory.component.LabelComponentFactory.labelDefaultSize;
    }
    return new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle(rManager.getBitmapFont(fontName, size), new com.badlogic.gdx.graphics.Color(tint[0], tint[1], tint[2], tint[3]));
}