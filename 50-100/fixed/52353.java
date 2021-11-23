@java.lang.Override
public void selected(com.badlogic.gdx.utils.Array<com.badlogic.gdx.files.FileHandle> files) {
    com.badlogic.gdx.files.FileHandle frm = files.first();
    com.badlogic.gdx.files.FileHandle atlas = new com.badlogic.gdx.files.FileHandle(((frm.pathWithoutExtension()) + ".atlas"));
    com.badlogic.gdx.files.FileHandle anm = new com.badlogic.gdx.files.FileHandle(((frm.pathWithoutExtension()) + ".anm"));
    com.badlogic.gdx.graphics.g2d.TextureAtlas tAtlas = new com.badlogic.gdx.graphics.g2d.TextureAtlas(atlas);
    com.lksoft.yugen.tools.animationeditor.SpritePack spritePack = new com.lksoft.yugen.tools.animationeditor.SpritePackReader(frm).read(tAtlas);
    setAnimationPack(new com.lksoft.yugen.tools.animationeditor.AnimationPack(spritePack), anm);
}