public static void main(java.lang.String[] args) {
    edu.ucla.sspace.mains.HALMain hal = new edu.ucla.sspace.mains.HALMain();
    try {
        hal.run(args);
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
}