public static void main(java.lang.String[] args) {
    TraceGenerator generator = new TraceGenerator(4, 4, 4, 4, 8, 12, 4, 4, 3, 5);
    Computation computation = generator.generateTrace();
    java.lang.System.out.println(computation);
    App app = new App(false, true, false, false);
    java.util.List<Computation> computations = app.generateComputations(computation);
}