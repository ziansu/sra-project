public com.badlogic.gdx.scenes.scene2d.ui.Table getLayout() {
    com.badlogic.gdx.scenes.scene2d.ui.Table table = new com.badlogic.gdx.scenes.scene2d.ui.Table();
    table.setTransform(true);
    table.setFillParent(true);
    adicionarBotoes(table);
    table.bottom().left().padBottom(((HALTURA_BTN) / 2)).padLeft(LARGURA_BTN);
    table.rotateBy(5);
    return table;
}