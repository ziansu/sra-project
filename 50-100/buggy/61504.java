@net.xprova.piccolo.Command
public void testCode(int printCounterExample) throws java.lang.Exception {
    int initial = 0;
    net.xprova.simulations.CodeSimulator sim1 = new net.xprova.simulations.CodeSimulator();
    if (printCounterExample == 1) {
        int[] counterExample = sim1.exploreSpace(initial);
        sim1.simulate(initial, counterExample);
    }else {
        sim1.exploreSpace(initial);
    }
}