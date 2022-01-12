public void createSelfJet(float x, float y) {
    mSelfJet = new jet.SelfJet(x, y, 50, mSelfJetPaint);
    for (int i = 0; i < (mSelfJet.getNumOfGuns()); i++) {
        java.util.ArrayList<java.lang.Integer> bulletStyles = new java.util.ArrayList<>();
        bulletStyles.add(Bullet.BULLET_STYLE_DEFAULT);
        mSelfJet.setGunType(i, Gun.GUN_TYPE_DEFAULT, bulletStyles);
    }
    (mRemainingLife)--;
    mCollisionEngine.setPlayer(mSelfJet);
    android.util.Log.d("Selfjet", "New self jet is created");
}