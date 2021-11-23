public static void main(java.lang.String[] args) {
    try {
        SchedRCPSPMM.solve("data/test", "src/output");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    Enterprise e = new Enterprise(500, 600);
    e.setResourceAmount(5, 8);
}