@org.junit.Test
public void runGameBamseVsAardvark() {
    pl.joegreen.sergeants.simulator.GameMap playerMap = pl.joegreen.sergeants.simulator.SimulatorFactory.createMapFromReplayFile("../test.json");
    pl.joegreen.sergeants.simulator.Simulator of = pl.joegreen.sergeants.simulator.SimulatorFactory.of(playerMap, 400, se.generaliobot.aardvark.Aardvark.provider(new se.generaliobot.bamse.config.Config()), se.generaliobot.bamse.Bamse.provider(new se.generaliobot.bamse.config.Config()));
    of.getListeners().add(new pl.joegreen.sergeants.simulator.SaveHistorySimulatorListener("../"));
    java.util.Optional<java.lang.Integer> start = of.start();
    java.lang.System.out.println(start);
    org.junit.Assert.assertEquals(java.util.Optional.of(0), start);
}