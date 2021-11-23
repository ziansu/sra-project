public static com.badlogic.gdx.graphics.g2d.BitmapFont getFont(int size) {
    if ((((utilities.FontManager.generator) == null) || ((utilities.FontManager.param) == null)) || ((utilities.FontManager.fonts) == null))
        return null;
    
    if ((utilities.FontManager.fonts.get(size)) == null) {
        utilities.FontManager.param.size = size;
        utilities.FontManager.fonts.put(size, utilities.FontManager.generator.generateFont(utilities.FontManager.param));
    }
    return utilities.FontManager.fonts.get(size);
}