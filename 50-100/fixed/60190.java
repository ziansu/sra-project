@java.lang.Override
public void loadSprites() {
    sprites = new engine.Sprite[spriteNames.length];
    for (int i = 0; i < (spriteNames.length); i++)
        sprites[i] = new engine.Sprite((((("actors/jobs/" + (pathname)) + "/") + (spriteNames[i])) + ".png"));
    
    mapSelf = new engine.Sprite((("actors/jobs/" + (pathname)) + "/mapwalk.png"), 2, 4);
    drawSprite = sprites[0];
}