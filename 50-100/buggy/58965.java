private void assignAttribute(int numAttr, java.util.ArrayList<java.lang.Double> attr) {
    java.lang.System.out.println(numAttr);
    for (int i = 0; i < numAttr; i++) {
        double degree = edu.umw.cpsc.collegesim.Sim.instance().random.nextDouble(false, true);
        java.lang.System.out.println("About to have a problem?");
        java.lang.System.out.println(i);
        java.lang.System.out.println(degree);
        attr.set(i, degree);
        java.lang.System.out.println("done");
    }
}