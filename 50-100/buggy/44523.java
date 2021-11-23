public static void main(java.lang.String[] argv) {
    Simulator sim = new Simulator();
    sim.read("CarWorld.wld");
    while (true) {
        sim.advance();
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
        }
    } 
}