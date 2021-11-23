public void draw(android.graphics.Canvas canvas) {
    canvas.drawColor(Color.BLACK);
    if (!(mSelfJet.isDead())) {
        mSelfJet.draw(canvas);
    }
    for (hacking.to.the.gate.Jet jet : mEnemyJets) {
        if (!(jet.isDead())) {
            jet.draw(canvas);
        }
    }
    for (hacking.to.the.gate.PowerUp p : mPowerUps) {
        if (p.isVisible()) {
            p.draw(canvas);
        }
    }
}