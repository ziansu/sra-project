public static void main(java.lang.String[] argv) {
    Simulator sim = new Simulator();
    sim.read(argv[0]);
    while (true) {
        sim.advance();
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
        }
    } 
}