@org.junit.Test
public void testUpgradeSoftwareInjectorSucces() throws hackattackfx.exceptions.NoUpgradeAllowedException, hackattackfx.exceptions.NotEnoughBitcoinsException {
    java.util.List<hackattackfx.Module> modules;
    modules = player1.getModules();
    hackattackfx.SoftwareInjector softwareInjector1 = ((hackattackfx.SoftwareInjector) (modules.get(0)));
    player1.upgradeSoftwareInjector(softwareInjector1);
    assertEquals("Levels aren't equal", softwareInjector.getLevel(), 2);
}