private void presentLevelEnd() {
    Assets.font.draw(game.batch, glyphLayout, (160 - ((glyphLayout.width) / 2)), (480 - 40));
    glyphLayout.setText(Asset.font, "Level Complete!");
    Assets.font.draw(game.batch, glyphLayout, (160 - ((glyphLayout.width) / 2)), 40);
}