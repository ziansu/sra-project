public static org.newdawn.slick.SpriteSheet makeSpriteSheet() {
    org.newdawn.slick.SpriteSheet spriteSheet = mock(org.newdawn.slick.SpriteSheet.class);
    org.newdawn.slick.Image image = mock(org.newdawn.slick.Image.class);
    when(spriteSheet.getSprite(org.mockito.Matchers.anyInt(), org.mockito.Matchers.anyInt())).thenReturn(image);
    return spriteSheet;
}