public static org.newdawn.slick.opengl.Texture QuickLoadTexture(java.lang.String name) {
    org.newdawn.slick.opengl.Texture tex = null;
    tex = com.Jakibah.Carbon.Utilities.Draw.loadTexture((("com/Jakibah/Carbon/Res/textures/" + name) + ".png"), "PNG");
    return tex;
}