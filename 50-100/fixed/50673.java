private void setFramePack(com.lksoft.sweat.stateless.SpritePack pack, com.badlogic.gdx.files.FileHandle frmFile) {
    this.frmFile = frmFile;
    spriteDefRenderer = new com.lksoft.sweat.tools.spriteeditor.SpriteDefRenderer();
    spriteDefRenderer.resize(lastW, lastH);
    spritePackWindow.setFramePack(pack);
    if ((pack.getSpriteDefs().size) > 0) {
        selectFrame(pack.getSpriteDefs().first());
    }
}