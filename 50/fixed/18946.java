public static void main(java.lang.String[] args) {
    Logger logger = null;
    Simulation simulation = Main.generateSimulation(java.lang.Integer.parseInt(args[0]));
    Simulator simulator = new Simulator(simulation, logger);
}