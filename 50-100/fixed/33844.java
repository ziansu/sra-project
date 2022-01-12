public java.util.List<java.util.Map<java.lang.String, victor.santiago.model.simulation.TeamPerformance>> simulate(int n) {
    java.util.List<java.util.Map<java.lang.String, victor.santiago.model.simulation.TeamPerformance>> simulations = new java.util.ArrayList<>();
    while (n > 0) {
        simulations.add(simulate());
        n--;
    } 
    return simulations;
}