private void stopNodes(java.util.ArrayList<fr.irisa.diverse.Flow.Node> nodes) {
    this.stop = true;
    for (java.lang.Thread t : running) {
        java.lang.System.out.println("Interrupting thread");
        t.interrupt();
        removeThread(t);
    }
    for (fr.irisa.diverse.Flow.Node n : nodes) {
        toLaunch.remove(n);
        owningWorkspace.stopNode(n);
    }
}