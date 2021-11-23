public void scheduleLarva(final long currentTime, final int larvaSystemIndex) {
    if (((larvaSystem.get(larvaSystemIndex).size()) < 3) && (!(isProducingLarva[(larvaSystemIndex + 1)]))) {
        isProducingLarva[(larvaSystemIndex + 1)] = true;
        java.lang.System.out.println(("Producing larva..." + currentTime));
        larvaSystem.get((larvaSystemIndex + 1)).add(new victorcruz.sc2_simulator.Units.LarvaMechanics.Larva(currentTime));
    }
}