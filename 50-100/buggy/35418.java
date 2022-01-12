@java.lang.Override
public mage.cards.MagePermanent getMageCard(mage.view.CardView permanent, java.awt.Dimension dimension, java.util.UUID gameId, mage.cards.action.ActionCallback callback, boolean canBeFoil, boolean loadImage) {
    org.mage.card.arcane.CardPanel cardPanel = new org.mage.card.arcane.CardPanel(permanent, gameId, loadImage, callback, false, dimension);
    boolean implemented = !(permanent.getRarity().equals(Rarity.NA));
    cardPanel.setShowCastingCost(implemented);
    return cardPanel;
}