public void talkAndCheck(java.lang.String key) {
    zildo.monde.sprites.persos.PersoPlayer hero = EngineZildo.persoManagement.getZildo();
    org.junit.Assert.assertTrue(((hero.getDialoguingWith()) == null));
    simulatePressButton(Keys.Q, 2);
    org.junit.Assert.assertTrue(((hero.getDialoguingWith()) != null));
    checkNextDialog(key);
    goOnDialog();
}