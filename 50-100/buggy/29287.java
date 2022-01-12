public void talkAndCheck(java.lang.String key) {
    zildo.monde.sprites.persos.PersoPlayer hero = EngineZildo.persoManagement.getZildo();
    org.junit.Assert.assertTrue(((hero.getDialoguingWith()) == null));
    simulatePressButton(Keys.Q, 2);
    java.lang.System.out.println(hero);
    java.lang.System.out.println(EngineZildo.persoManagement.getNamedPerso("jaune"));
    org.junit.Assert.assertTrue(((hero.getDialoguingWith()) != null));
    checkNextDialog(key);
    goOnDialog();
}