@java.lang.Override
protected void onCycleEnd() {
    nbRecvMsgs = 0;
    for (java.util.Map.Entry<java.lang.Long, double[]> entry : recvCostTables.entrySet()) {
        java.lang.Long key = entry.getKey();
        double[] value = entry.getValue();
        costTables.put(key, value.clone());
    }
    java.lang.System.out.println(((("Agent " + (getName())) + " Terminating cycle  ") + (getCurrentCycle())));
}