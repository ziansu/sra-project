@java.lang.Override
public void onEnd(com.kegelapps.palace.graphics.Animation animation) {
    com.kegelapps.palace.graphics.utils.HandUtils.Reparent(mPlayView, cardView);
    builder.getTable().getHand(builder.getHandID()).OrganizeCards(true);
    mPlayView.OrganizeCards();
}