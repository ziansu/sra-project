public void testMafiosoGettingReinsertedIntoOoO() {
    shared.logic.Player driver = addPlayer(shared.logic.templates.BasicRoles.BusDriver());
    shared.logic.Player maf = addPlayer(shared.logic.templates.BasicRoles.Mafioso());
    shared.logic.Player doc = addPlayer(shared.logic.templates.BasicRoles.Doctor());
    shared.logic.Player cit = addPlayer(shared.logic.templates.BasicRoles.Citizen());
    driver.isCharged = maf.isCharged = true;
    drive(driver, maf, cit);
    mafKill(maf, doc);
    setTarget(doc, cit);
    endNight();
    isDead(driver, doc);
    isAlive(maf);
}