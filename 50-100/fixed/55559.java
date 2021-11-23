private void constructLabels() {
    roboticonPurchaseAmountLabel = new com.badlogic.gdx.scenes.scene2d.ui.Label((((roboticonPurchaseAmount) + "/") + (game.market.getResource(ResourceType.ROBOTICON))), game.skin);
    roboticonPurchaseAmountLabel.setAlignment(Align.center);
    selectedRoboticonIDLabel = new com.badlogic.gdx.scenes.scene2d.ui.Label("", game.skin);
    selectedRoboticonIDLabel.setAlignment(Align.center);
}