private void buildProcessBlockVariables() {
    com.org.gnos.core.Tree processtree = projectConfiguration.getProcessTree();
    java.util.List<com.org.gnos.core.Node> porcesses = processtree.getLeafNodes();
    java.util.List<com.org.gnos.core.Block> processBlocks = new java.util.ArrayList<>();
    int processNumber = 1;
    for (com.org.gnos.core.Node process : porcesses) {
        java.lang.String condition = buildCondition(process);
        java.util.List<com.org.gnos.core.Block> blocks = findBlocks(condition);
        processBlocks.addAll(blocks);
        buildProcessVariables(process, blocks, processNumber);
        processNumber++;
    }
    buildStockpileVariables(processBlocks);
}