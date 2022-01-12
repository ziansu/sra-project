public static void main(java.lang.String[] args) {
    org.sidoh.reactor_simulator.simulator.BigReactorSimulator.init();
    java.lang.String reactor = "EEEEEXXEEEEE";
    org.sidoh.reactor_simulator.simulator.FakeReactorWorld fakeReactorWorld = org.sidoh.reactor_simulator.simulator.FakeReactorWorld.makeReactor(reactor, 6, 5, 3);
    org.sidoh.reactor_simulator.simulator.ReactorResult simulate = new org.sidoh.reactor_simulator.simulator.BigReactorSimulator(false, 10000).simulate(fakeReactorWorld);
    java.lang.System.out.println(simulate);
}