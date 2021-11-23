private void assignAttribute(int numAttr, java.util.ArrayList<java.lang.Double> attr) {
    java.lang.System.out.println(numAttr);
    for (int i = 0; i < numAttr; i++) {
        double degree = edu.umw.cpsc.collegesim.Sim.instance().random.nextDouble(false, true);
        attr.set(i, degree);
    }
}