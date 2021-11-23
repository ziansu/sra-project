private void drawCardFromDeck(android.view.View v) {
    if (mDrawCard) {
        com.levigilad.javaplay.infra.ActivityUtils.setEnabledRecursively(mDiscardedCardsLL, false);
        mDeckIV.setEnabled(false);
        com.levigilad.javaplay.yaniv.YanivGame.onDrawFromGlobalDeck(getCurrentParticipantId(), ((com.levigilad.javaplay.yaniv.YanivTurn) (mTurnData)));
        mDrawCard = false;
        finishTurn();
    }
}