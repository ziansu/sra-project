public void create() {
    com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator generator = new com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator(Gdx.files.internal("skin/VL-Gothic-Regular.ttf"));
    com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter parameter = new com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter();
    parameter.size = 24;
    title = "result";
    parameter.characters = title;
    titlefont = generator.generateFont(parameter);
    time = java.lang.System.currentTimeMillis();
    updateScoreDatabase();
}